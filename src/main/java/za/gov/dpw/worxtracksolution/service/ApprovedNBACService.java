package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ApprovedNBACDao;
import za.gov.dpw.worxtracksolution.entity.ApprovedNBAC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovedNBACService {

    @Autowired
    private ApprovedNBACDao approvedNBACDao;

    public ApprovedNBAC saveApprovedNBAC(ApprovedNBAC approvedNBAC){
        ApprovedNBAC existingApprovedNBAC = approvedNBACDao.findByPtsRef(approvedNBAC.getPtsRef());
        if (existingApprovedNBAC != null){
            existingApprovedNBAC.setApprovedNBACStatus(approvedNBAC.getApprovedNBACStatus());
            existingApprovedNBAC.setApprovedNBACDate(approvedNBAC.getApprovedNBACDate());

        }
        return approvedNBACDao.save(approvedNBAC);
    }

    public List<ApprovedNBAC> getAllByPtsRef(String ptsRef) {
        return approvedNBACDao.findAllByPtsRef(ptsRef);
    }
}
