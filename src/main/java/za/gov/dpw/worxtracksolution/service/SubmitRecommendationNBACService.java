package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SubmitRecommendationNBACDao;
import za.gov.dpw.worxtracksolution.entity.SubmitRecommendationNBAC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmitRecommendationNBACService {

    @Autowired
    private SubmitRecommendationNBACDao submitRecommendationNBACDao;

    public SubmitRecommendationNBAC saveSubmitRecommendationNBAC(SubmitRecommendationNBAC submitRecommendationNBAC){
        return submitRecommendationNBACDao.save(submitRecommendationNBAC);
    }

    public List<SubmitRecommendationNBAC> getAllByPtsRef(String ptsRef) {
        return submitRecommendationNBACDao.findAllByPtsRef(ptsRef);
    }
}
