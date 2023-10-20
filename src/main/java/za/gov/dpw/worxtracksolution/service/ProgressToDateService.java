package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ProgressToDateDao;
import za.gov.dpw.worxtracksolution.entity.ProgressToDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressToDateService {

    @Autowired
    private ProgressToDateDao progressToDateDao;

    public ProgressToDate saveProgressToDate(ProgressToDate progressToDate){
        return progressToDateDao.save(progressToDate);
    }

    public List<ProgressToDate> getAllByPtsRef(String ptsRef) {
        return progressToDateDao.findAllByPtsRef(ptsRef);
    }
}
