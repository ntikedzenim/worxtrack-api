package za.gov.dpw.worxtracksolution.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import za.gov.dpw.worxtracksolution.dao.AttachmentDao;
import za.gov.dpw.worxtracksolution.entity.Attachment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import za.gov.dpw.worxtracksolution.entity.FileModel;
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

@Service
public class AttachmentService {

    @Autowired
    private AttachmentDao attachmentDao;

    @Value("${file.storage.tmpDirectory}") // Configure the temporary directory path in application.properties
    private String tmpDirectory;

    public Attachment saveFile(MultipartFile file, String ptsRef) {
//        Generate a unique file name
//        String filename = UUID.randomUUID().toString() + "-" + StringUtils.cleanPath(file.getOriginalFilename());
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        String tmpFilePath = tmpDirectory + File.separator + filename;

        try {
            // Save the file to the temporary directory
            Files.copy(file.getInputStream(), Paths.get(tmpFilePath), StandardCopyOption.REPLACE_EXISTING);


            Attachment model = new Attachment(filename, file.getContentType(), null, ptsRef);
            try {
                return attachmentDao.save(model);
            } catch (DataIntegrityViolationException e) {
                // Handle the conflict when saving to the database
                throw new FileSaveException(FileErrors.FILE_ALREADY_EXISTS, e);
            }
        } catch (IOException e) {
            // Handle the error when saving the file
            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
        }
    }

    public Optional<Path> getFile(String fileId) {
        Optional<Attachment> fileModelOptional = attachmentDao.findById(fileId);
        if (fileModelOptional.isPresent()) {
            Attachment fileModel = fileModelOptional.get();
            String filePath = tmpDirectory + File.separator + fileModel.getFileName(); // Modified line to access the filename directly
            Path path = Paths.get(filePath);
            if (Files.exists(path)) {
                return Optional.of(path);
            }
        }
        throw new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId);
    }

    public List<Attachment> getListOfFiles() {
        return attachmentDao.findAll();
    }

}