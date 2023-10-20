package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ResubmittedNBACDao;
import za.gov.dpw.worxtracksolution.entity.ResubmittedNBAC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResubmittedNBACService {

    @Autowired
    private ResubmittedNBACDao resubmittedNBACDao;

    public ResubmittedNBAC saveResubmittedNBAC(ResubmittedNBAC resubmittedNBAC){
        return resubmittedNBACDao.save(resubmittedNBAC);
    }

    public ResubmittedNBAC getResubmittedNBAC(String ptsRef){
        return resubmittedNBACDao.findByPtsRef(ptsRef);
    }

    public List<ResubmittedNBAC> getAllByPtsRef(String ptsRef) {
        return resubmittedNBACDao.findAllByPtsRef(ptsRef);
    }
}
