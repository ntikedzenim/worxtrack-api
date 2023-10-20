package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.FeedbackNBACDao;
import za.gov.dpw.worxtracksolution.entity.FeedbackNBAC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackNBACService {

    @Autowired
    private FeedbackNBACDao feedbackNBACDao;

    public FeedbackNBAC saveFeedbackNBAC(FeedbackNBAC feedbackNBAC){
        return feedbackNBACDao.save(feedbackNBAC);
    }

    public List<FeedbackNBAC> getAllByPtsRef(String ptsRef) {
        return feedbackNBACDao.findAllByPtsRef(ptsRef);
    }
}
