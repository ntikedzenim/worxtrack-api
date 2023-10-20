package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ResubmittedNBAC2Dao;
import za.gov.dpw.worxtracksolution.entity.ResubmittedNBAC2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResubmittedNBAC2Service {

    @Autowired
    private ResubmittedNBAC2Dao resubmittedNBAC2Dao;

    public ResubmittedNBAC2 saveResubmittedNBAC2(ResubmittedNBAC2 resubmittedNBAC2){
        return resubmittedNBAC2Dao.save(resubmittedNBAC2);
    }

    public List<ResubmittedNBAC2> getAllByPtsRef(String ptsRef) {
        return resubmittedNBAC2Dao.findAllByPtsRef(ptsRef);
    }
}
