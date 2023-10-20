package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ApprovedNBAC2Dao;
import za.gov.dpw.worxtracksolution.entity.ApprovedNBAC2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprovedNBAC2Service {

    @Autowired
    private ApprovedNBAC2Dao approvedNBAC2Dao;

    public ApprovedNBAC2 saveApprovedNBAC2(ApprovedNBAC2 approvedNBAC2){
        ApprovedNBAC2 existingApprovedNBAC2 = approvedNBAC2Dao.findByPtsRef(approvedNBAC2.getPtsRef());
        if (existingApprovedNBAC2 != null){
            existingApprovedNBAC2.setApprovedNBAC2Status(approvedNBAC2.getApprovedNBAC2Status());
            existingApprovedNBAC2.setApprovedNBAC2Date(approvedNBAC2.getApprovedNBAC2Date());

            return approvedNBAC2Dao.save(approvedNBAC2);
        } else {
            return approvedNBAC2Dao.save(approvedNBAC2);
        }
    }

    public List<ApprovedNBAC2> getAllByPtsRef(String ptsRef) {
        return approvedNBAC2Dao.findAllByPtsRef(ptsRef);
    }
}
