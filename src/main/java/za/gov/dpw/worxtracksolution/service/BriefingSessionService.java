package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BriefingSessionDao;
import za.gov.dpw.worxtracksolution.entity.BriefingSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BriefingSessionService {

    @Autowired
    private BriefingSessionDao briefingSessionDao;

    public BriefingSession saveBriefingSession(BriefingSession briefingSession){
        return briefingSessionDao.save(briefingSession);
    }

    public List<BriefingSession> getAllByPtsRef(String ptsRef) {
        return briefingSessionDao.findAllByPtsRef(ptsRef);
    }
}
