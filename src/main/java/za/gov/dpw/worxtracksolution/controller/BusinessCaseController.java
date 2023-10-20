package za.gov.dpw.worxtracksolution.controller;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import za.gov.dpw.worxtracksolution.dao.AttachmentDao;
import za.gov.dpw.worxtracksolution.dao.BusinessCaseRepository;
import za.gov.dpw.worxtracksolution.entity.FileModel;
import za.gov.dpw.worxtracksolution.files.FileResponse;
import za.gov.dpw.worxtracksolution.service.AttachmentService;
import za.gov.dpw.worxtracksolution.service.BusinessCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import za.gov.dpw.worxtracksolution.entity.Attachment;
import za.gov.dpw.worxtracksolution.entity.BusinessCase;


import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class BusinessCaseController {

    @Autowired
    private BusinessCaseService businessCaseService;

    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private AttachmentDao attachmentDao;

    @Autowired
    private BusinessCaseRepository businessCaseRepository;

    @PostMapping("/addBusinessCase")
    public BusinessCase addBusinessCase(@RequestBody BusinessCase businessCase){
        return businessCaseService.saveOrUpdateBusinessCase(businessCase);
    }


    @GetMapping("/getAllBusinessCase")
    public List<BusinessCase> getAllBusinessCase(){
        return businessCaseService.getAllBusinessCase();
    }

    @PostMapping("/upload")
    public FileResponse uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("ptsRef") String ptsRef) {

        Attachment model = attachmentService.saveFile(file,ptsRef);

        String fileUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/download/").
                path(model.getFileId()).toUriString();
        return new FileResponse(model.getFileName(), model.getFileType(), fileUri);
    }

    @GetMapping("/documents/{ptsRef}")
    public ResponseEntity<List<Attachment>> getByPtsRef(@PathVariable String ptsRef){
        return new ResponseEntity<List<Attachment>>(attachmentDao.findByPtsRef(ptsRef), HttpStatus.OK);

    }

    @GetMapping("/projects/{ptsRef}/{projectManagerEmail}")
    public List<Object[]> getProjectDetailsAndBusinessCaseByPtsRefAndUserId(
            @PathVariable("ptsRef") String ptsRef,
            @PathVariable("projectManagerEmail") String projectManagerEmail
    ) {
        return businessCaseRepository.findProjectDetailsAndBusinessCaseByPtsRefAndProjectManagerEmail(ptsRef, projectManagerEmail);
    }

}
