package za.gov.dpw.worxtracksolution.controller;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import za.gov.dpw.worxtracksolution.dao.FileModelRepository;
import za.gov.dpw.worxtracksolution.entity.FileModel;
import za.gov.dpw.worxtracksolution.entity.ProjectDetails;
import za.gov.dpw.worxtracksolution.files.FileDeleteException;
import za.gov.dpw.worxtracksolution.files.FileNotFoundException;
import za.gov.dpw.worxtracksolution.files.FileResponse;
import za.gov.dpw.worxtracksolution.service.FileModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/files")
@CrossOrigin
public class FileModelController {

    @Autowired
    private FileModelService fileModelService;

    @Autowired
    private FileModelRepository fileModelRepository;

//    @PostMapping("/upload")
//    public FileResponse uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("ptsRef") String ptsRef) {
//
//        FileModel model = fileModelService.saveFile(file,ptsRef);
//
//        String fileUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").
//                path(model.getFileId()).toUriString();
//        return new FileResponse(model.getFileName(), model.getFileType(), fileUri);
//    }

    @PostMapping("/upload/{projectTitle}")
    public FileResponse uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("ptsRef") String ptsRef, @PathVariable String projectTitle) {

        FileModel model = fileModelService.saveFile(file,ptsRef,projectTitle);

        String fileUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").
                path(model.getFileId()).toUriString();
        return new FileResponse(model.getFileName(), model.getFileType(), fileUri);
    }

    @GetMapping("/download/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) throws IOException {
        Optional<Path> optionalPath = fileModelService.getFile(fileId);
        if (optionalPath.isPresent()) {
            Path path = optionalPath.get();
            File file = path.toFile();

            Resource resource = new FileSystemResource(file);

            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"")
                    .body(resource);
        }

        throw new FileNotFoundException("File not found");
    }

    @GetMapping("/get-document/{fileId}")
    public ResponseEntity<byte[]> getDocument(@PathVariable String fileId) throws IOException {
        // Retrieve the document content based on fileId
        byte[] documentContent = fileModelService.getDocumentContent(fileId);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        headers.setContentDispositionFormData("inline", "document.pdf"); // Set the filename and indicate inline viewing

        return new ResponseEntity<>(documentContent, headers, HttpStatus.OK);
    }




    @GetMapping("/businessCase/{ptsRef}")
    public ResponseEntity<List<FileModel>> getByPtsRef(@PathVariable String ptsRef){
        return new ResponseEntity<List<FileModel>>(fileModelRepository.findByPtsRef(ptsRef), HttpStatus.OK);

    }


    @GetMapping("/allFiles")
    public  List<FileModel>  getListFiles(Model model) {
        List<FileModel> fileDetails = fileModelService.getListOfFiles();

        return fileDetails;
    }

    @DeleteMapping("/delete/{fileId}")
    public ResponseEntity<String> deleteFile(@PathVariable String fileId) {
        try {
            fileModelService.deleteFileByFileId(fileId); // Calls the service to delete the record from the database
            return ResponseEntity.ok("File record deleted successfully.");
        } catch (FileNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("File not found.");
        } catch (FileDeleteException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete the file record.");
        }
    }

}