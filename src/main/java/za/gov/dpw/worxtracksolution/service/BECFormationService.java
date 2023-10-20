package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BECFormationDao;
import za.gov.dpw.worxtracksolution.entity.BECFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BECFormationService {

    @Autowired
    private BECFormationDao becFormationDao;

    public BECFormation saveBECFormation(BECFormation becFormation){
        return becFormationDao.save(becFormation);
    }

    public List<BECFormation> getAllByPtsRef(String ptsRef) {
        return becFormationDao.findAllByPtsRef(ptsRef);
    }
}
