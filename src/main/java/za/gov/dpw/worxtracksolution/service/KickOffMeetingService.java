package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.KickOffMeetingDao;
import za.gov.dpw.worxtracksolution.entity.KickOffMeeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KickOffMeetingService {

    @Autowired
    private KickOffMeetingDao kickOffMeetingDao;

    public KickOffMeeting saveKickOffMeeting(KickOffMeeting kickOffMeeting){
        return kickOffMeetingDao.save(kickOffMeeting);
    }

    public List<KickOffMeeting> getAllByPtsRef(String ptsRef) {
        return kickOffMeetingDao.findAllByPtsRef(ptsRef);
    }
}
