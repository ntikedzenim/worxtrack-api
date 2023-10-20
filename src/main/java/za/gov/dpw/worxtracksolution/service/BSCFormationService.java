package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BSCFormationDao;
import za.gov.dpw.worxtracksolution.entity.BSCFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSCFormationService {

    @Autowired
    private BSCFormationDao bscFormationDao;

    public BSCFormation saveBSCFormation(BSCFormation bscFormation){
        return bscFormationDao.save(bscFormation);
    }

    public List<BSCFormation> getAllByPtsRef(String ptsRef) {
        return bscFormationDao.findAllByPtsRef(ptsRef);
    }
}
