package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.NBACFeedbackRecommendationDao;
import za.gov.dpw.worxtracksolution.entity.NBACFeedbackRecommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NBACFeedbackRecommendationService {

    @Autowired
    private NBACFeedbackRecommendationDao nbacFeedbackRecommendationDao;

    public NBACFeedbackRecommendation saveNBACFeedbackRecommendation(NBACFeedbackRecommendation nbacFeedbackRecommendation){
        return nbacFeedbackRecommendationDao.save(nbacFeedbackRecommendation);
    }

    public List<NBACFeedbackRecommendation> getAllByPtsRef(String ptsRef) {
        return nbacFeedbackRecommendationDao.findAllByPtsRef(ptsRef);
    }
}
