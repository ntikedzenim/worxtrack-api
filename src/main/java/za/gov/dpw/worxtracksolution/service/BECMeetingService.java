package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BECMeetingDao;
import za.gov.dpw.worxtracksolution.entity.BECMeeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BECMeetingService {

    @Autowired
    private BECMeetingDao becMeetingDao;

    public BECMeeting saveBECMeeting(BECMeeting becMeeting){
        return becMeetingDao.save(becMeeting);
    }

    public List<BECMeeting> getAllByPtsRef(String ptsRef) {
        return becMeetingDao.findAllByPtsRef(ptsRef);
    }
}
