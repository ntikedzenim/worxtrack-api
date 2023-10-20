package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BusinessCaseRepository;
import za.gov.dpw.worxtracksolution.entity.BusinessCase;
import za.gov.dpw.worxtracksolution.entity.FileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessCaseService {

    @Autowired
    private BusinessCaseRepository businessCaseRepository;

    public BusinessCase saveOrUpdateBusinessCase(BusinessCase businessCase){
        BusinessCase existingBusinessCase = businessCaseRepository.findByPtsRef(businessCase.getPtsRef());
        if (existingBusinessCase != null) {
            // update the existing BusinessCase object
            existingBusinessCase.setBusinessCaseDate(businessCase.getBusinessCaseDate());
            existingBusinessCase.setBusinessCaseStatus(businessCase.getBusinessCaseStatus());
            existingBusinessCase.setProjectTitle(businessCase.getProjectTitle());
            return businessCaseRepository.save(existingBusinessCase);
        } else {
            // create a new BusinessCase object
            return businessCaseRepository.save(businessCase);
        }
    }

    public List<BusinessCase> getAllBusinessCase(){
        return (List<BusinessCase>) businessCaseRepository.findAll();
    }

    public BusinessCase findByPtsRef(String ptsRef){
        return businessCaseRepository.findByPtsRef(ptsRef);
    }

    public FileModel findFileById(Long businessCaseId) {
        return businessCaseRepository.findFileByBusinessCaseId(businessCaseId);
    }

    public List<BusinessCase> getAllByPtsRef(String ptsRef) {
        return businessCaseRepository.findAllByPtsRef(ptsRef);
    }

}
