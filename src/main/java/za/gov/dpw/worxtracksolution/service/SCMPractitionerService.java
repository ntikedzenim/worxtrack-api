package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SCMPractitionerDao;
import za.gov.dpw.worxtracksolution.entity.SCMPractitioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SCMPractitionerService {

    @Autowired
    private SCMPractitionerDao scmPractitionerDao;

    public SCMPractitioner saveSCMPractitioner(SCMPractitioner scmPractitioner){
        return scmPractitionerDao.save(scmPractitioner);
    }

//    public SCMPractitioner saveSCMPractitioner(SCMPractitioner scmPractitioner){
//        SCMPractitioner existingSCMPractitioner = scmPractitionerDao.findByPtsRef(scmPractitioner.getPtsRef());
//        if (existingSCMPractitioner != null) {
//            existingSCMPractitioner.setScmPractitionerStatus(scmPractitioner.getScmPractitionerStatus());
//            existingSCMPractitioner.setScmPractitionerDate(scmPractitioner.getScmPractitionerDate());
//            // update other fields as needed
//            return scmPractitionerDao.save(existingSCMPractitioner);
//        } else {
//            return scmPractitionerDao.save(scmPractitioner);
//        }
//    }

    public List<SCMPractitioner> getAllByPtsRef(String ptsRef) {
        return scmPractitionerDao.findAllByPtsRef(ptsRef);
    }
}
