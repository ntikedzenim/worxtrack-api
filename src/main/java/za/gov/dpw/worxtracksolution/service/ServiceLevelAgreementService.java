package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ServiceLevelAgreementDao;
import za.gov.dpw.worxtracksolution.entity.ServiceLevelAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLevelAgreementService {

    @Autowired
    private ServiceLevelAgreementDao serviceLevelAgreementDao;

    public ServiceLevelAgreement saveServiceLevelAgreement(ServiceLevelAgreement serviceLevelAgreement){
        return serviceLevelAgreementDao.save(serviceLevelAgreement);
    }

    public List<ServiceLevelAgreement> getAllByPtsRef(String ptsRef) {
        return serviceLevelAgreementDao.findAllByPtsRef(ptsRef);
    }
}
