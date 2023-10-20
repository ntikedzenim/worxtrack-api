package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.LegalServicesDao;
import za.gov.dpw.worxtracksolution.entity.LegalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalServicesService {

    @Autowired
    private LegalServicesDao legalServicesDao;

    public LegalServices saveLegalServices(LegalServices legalServices){
        return legalServicesDao.save(legalServices);
    }

    public List<LegalServices> getAllByPtsRef(String ptsRef) {
        return legalServicesDao.findAllByPtsRef(ptsRef);
    }
}
