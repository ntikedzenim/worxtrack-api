package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ToREndorsedDao;
import za.gov.dpw.worxtracksolution.entity.ToREndorsed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToREndorsedService {

    @Autowired
    private ToREndorsedDao toREndorsedDao;

    public ToREndorsed saveToREndorsed(ToREndorsed toREndorsed){
        return toREndorsedDao.save(toREndorsed);
    }

    public List<ToREndorsed> getAllByPtsRef(String ptsRef) {
        return toREndorsedDao.findAllByPtsRef(ptsRef);
    }
}
