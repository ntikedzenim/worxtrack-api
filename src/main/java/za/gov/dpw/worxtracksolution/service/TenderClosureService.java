package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.TenderClosureDao;
import za.gov.dpw.worxtracksolution.entity.TenderClosure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderClosureService {

    @Autowired
    private TenderClosureDao tenderClosureDao;

    public TenderClosure saveTenderClosure(TenderClosure tenderClosure){
        return tenderClosureDao.save(tenderClosure);
    }

    public List<TenderClosure> getAllByPtsRef(String ptsRef) {
        return tenderClosureDao.findAllByPtsRef(ptsRef);
    }
}
