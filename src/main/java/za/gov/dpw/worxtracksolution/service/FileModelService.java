package za.gov.dpw.worxtracksolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import za.gov.dpw.worxtracksolution.dao.FileModelRepository;
import za.gov.dpw.worxtracksolution.entity.FileModel;
import za.gov.dpw.worxtracksolution.files.FileDeleteException;
import za.gov.dpw.worxtracksolution.files.FileErrors;
import za.gov.dpw.worxtracksolution.files.FileNotFoundException;
import za.gov.dpw.worxtracksolution.files.FileSaveException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileModelService {

    @Autowired
    private FileModelRepository fileModelRepository;

    @Value("${file.storage.tmpDirectory}") // Configure the temporary directory path in application.properties
    private String tmpDirectory;

    @Value("${file.upload.pemDirectory}") // Add the file upload endpoint URL in application.properties
    private String fileUploadEndpoint;

    public FileModel saveFile(MultipartFile file, String ptsRef, String projectTitle) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        String appPath = (tmpDirectory + ptsRef);
        String tmpFilePath = appPath + File.separator + filename;

        try {
            // Create the directory if it doesn't exist
            Path directoryPath = Paths.get(appPath);
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            // Save the file to the temporary directory
            Files.copy(file.getInputStream(), Paths.get(tmpFilePath), StandardCopyOption.REPLACE_EXISTING);

            // Send the file to the remote server
            sendFileToRemoteServer(fileUploadEndpoint);

            FileModel model = new FileModel(projectTitle, filename, file.getContentType(), null, ptsRef);
            try {
                return fileModelRepository.save(model);
            } catch (DataIntegrityViolationException e) {
                // Handle the conflict when saving to the database
                throw new FileSaveException(FileErrors.FILE_ALREADY_EXISTS, e);
            }
        } catch (IOException e) {
            // Handle the error when saving the file
            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
        }
    }


    private void sendFileToRemoteServer(String filePath) {
        try {
            RestTemplate restTemplate = new RestTemplate();

            // Prepare the authentication headers
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
            headers.setBasicAuth("worxtrack", "worxtrack@123"); // Set your username and password

            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("file", new ByteArrayResource(Files.readAllBytes(Paths.get(filePath))));

            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

            // Construct the remote URL where you want to upload the file
            String remoteUploadURL = "https://worx4uedms.dpw.gov.za/public/file/Worxstation/WorxTrack"; // Replace with your actual URL

            ResponseEntity<String> response = restTemplate.exchange(remoteUploadURL, HttpMethod.POST, requestEntity, String.class);

            if (response.getStatusCode() == HttpStatus.OK) {
                // Handle success response
            } else {
                // Handle error response
            }
        } catch (HttpClientErrorException e) {
            // Handle HTTP client error
        } catch (Exception e) {
            // Handle other exceptions
        }
    }


//    private void sendFileToRemoteServer(String filePath) {
//        try {
//            RestTemplate restTemplate = new RestTemplate();
//
//            // Prepare the authentication headers
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//            headers.setBasicAuth("worxtrack", "worxtrack@123"); // Set your username and password
//
//            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
//            body.add("file", new ByteArrayResource(Files.readAllBytes(Paths.get(filePath))));
//
//            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
//
//            ResponseEntity<String> response = restTemplate.exchange(fileUploadEndpoint, HttpMethod.POST, requestEntity, String.class);
//
//            if (response.getStatusCode() == HttpStatus.OK) {
//                // Handle success response
//            } else {
//                // Handle error response
//            }
//        } catch (HttpClientErrorException e) {
//            // Handle HTTP client error
//        } catch (Exception e) {
//            // Handle other exceptions
//        }
//    }



    public Optional<Path> getFile(String fileId) {
        Optional<FileModel> fileModelOptional = fileModelRepository.findById(fileId);
        if (fileModelOptional.isPresent()) {
            FileModel fileModel = fileModelOptional.get();
            String filePath = tmpDirectory + File.separator + fileModel.getFileName(); // Modified line to access the filename directly
            Path path = Paths.get(filePath);
            if (Files.exists(path)) {
                return Optional.of(path);
            }
        }
        throw new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId);
    }

    public List<FileModel> getListOfFiles() {
        return fileModelRepository.findAll();
    }

    public void deleteFileByFileId(String fileId) {
        Optional<FileModel> fileModelOptional = fileModelRepository.findById(fileId);

        if (fileModelOptional.isPresent()) {
            FileModel fileModel = fileModelOptional.get();
            fileModelRepository.delete(fileModel);
        } else {
            throw new FileNotFoundException("File not found: " + fileId);
        }
    }

    public ResponseEntity<byte[]> getDocument(String fileId) throws IOException {
        byte[] documentContent = getDocumentContent(fileId);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        headers.setContentDispositionFormData("inline", "document.pdf");

        return new ResponseEntity<>(documentContent, headers, HttpStatus.OK);
    }

    // Implement getDocumentContent method for retrieving document content based on fileId
    public byte[] getDocumentContent(String fileId) throws IOException {
        // Replace this with your actual logic to retrieve the document content based on fileId.
        // This can involve reading the file content from a database, file system, or any other storage.

        // For demonstration purposes, we'll use a sample byte array.
        byte[] documentContent = "Sample PDF Content".getBytes();

        return documentContent;
    }

// Upload Certificate

//    public FileModel saveFile(MultipartFile file, String ptsRef, String projectTitle) {
//        String filename = StringUtils.cleanPath(file.getOriginalFilename());
//        String appPath = (tmpDirectory + projectTitle);
//        String tmpFilePath = appPath + File.separator + filename;
//
//        try {
//            // Create the directory if it doesn't exist
//            Path directoryPath = Paths.get(appPath);
//            if (!Files.exists(directoryPath)) {
//                Files.createDirectories(directoryPath);
//            }
//
//            // Save the file to the temporary directory
//            Files.copy(file.getInputStream(), Paths.get(tmpFilePath), StandardCopyOption.REPLACE_EXISTING);
//
//            // Send the file to the remote server
//            sendFileToRemoteServer(file);
//
//            FileModel model = new FileModel(projectTitle, filename, file.getContentType(), null, ptsRef);
//            try {
//                return fileModelRepository.save(model);
//            } catch (DataIntegrityViolationException e) {
//                // Handle the conflict when saving to the database
//                throw new FileSaveException(FileErrors.FILE_ALREADY_EXISTS, e);
//            }
//        } catch (IOException e) {
//            // Handle the error when saving the file
//            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
//        }
//    }
//
//    private void sendFileToRemoteServer(MultipartFile file) {
//        try {
//            RestTemplate restTemplate = new RestTemplate();
//            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
//            body.add("file", new ByteArrayResource(file.getBytes()));
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//
//            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
//
//            ResponseEntity<String> response = restTemplate.exchange(fileUploadEndpoint, HttpMethod.POST, requestEntity, String.class);
//
//            if (response.getStatusCode() != HttpStatus.OK) {
//                // Handle error response from the remote server
//                throw new FileSaveException("Failed to upload file to the remote server");
//            }
//        } catch (IOException e) {
//            // Handle IOException
//            throw new FileSaveException("Failed to read the file or upload it to the remote server", e);
//        }
//    }


}



//    private void sendFileToRemoteServer(MultipartFile file) {
//        try {
//            // Define the file upload URL
//            String fileUploadEndpoint = "https://worx4uedms.dpw.gov.za/public/file/Worxstation/WorxTrack";
//
//            // Set up HTTP Basic Authentication credentials
//            String username = "worxtrack";
//            String password = "worxtrack@123";
//
//            RestTemplate restTemplate = new RestTemplate();
//
//            // Create a MultiValueMap to hold the file
//            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
//            body.add("file", new ByteArrayResource(file.getBytes()));
//
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.MULTIPART_FORM_DATA);
//
//            // Add Basic Authentication credentials to the headers
//            headers.setBasicAuth(username, password);
//
//            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);
//
//            ResponseEntity<String> response = restTemplate.exchange(fileUploadEndpoint, HttpMethod.POST, requestEntity, String.class);
//
//            if (response.getStatusCode() != HttpStatus.OK) {
//                // Handle error response from the remote server
//                throw new FileSaveException("Failed to upload file to the remote server");
//            }
//        } catch (IOException e) {
//            // Handle IOException
//            throw new FileSaveException("Failed to read the file or upload it to the remote server", e);
//        }
//    }