package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.AwardedProjectValueDao;
import za.gov.dpw.worxtracksolution.entity.AwardedProjectValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardedProjectValueService {

    @Autowired
    private AwardedProjectValueDao awardedProjectValueDao;

    public AwardedProjectValue saveAwardedProjectValue(AwardedProjectValue awardedProjectValue){
     return awardedProjectValueDao.save(awardedProjectValue);
    }

    public List<AwardedProjectValue> getAllByPtsRef(String ptsRef) {
        return awardedProjectValueDao.findAllByPtsRef(ptsRef);
    }
}
