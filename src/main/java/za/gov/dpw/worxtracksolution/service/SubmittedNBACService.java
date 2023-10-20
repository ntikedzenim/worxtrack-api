package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SubmittedNBACDao;
import za.gov.dpw.worxtracksolution.entity.SubmittedNBAC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmittedNBACService {

    @Autowired
    private SubmittedNBACDao submittedNBACDao;

    public SubmittedNBAC saveSubmittedNBAC(SubmittedNBAC submittedNBAC){
        return submittedNBACDao.save(submittedNBAC);
    }

    public List<SubmittedNBAC> getAllByPtsRef(String ptsRef) {
        return submittedNBACDao.findAllByPtsRef(ptsRef);
    }
}
