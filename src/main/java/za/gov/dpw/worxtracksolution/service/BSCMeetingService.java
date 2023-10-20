package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BSCMeetingDao;
import za.gov.dpw.worxtracksolution.entity.BSCMeeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSCMeetingService {

    @Autowired
    private BSCMeetingDao bscMeetingDao;

    public BSCMeeting saveBSCMeeting(BSCMeeting bscMeeting){
        return bscMeetingDao.save(bscMeeting);
    }

    public List<BSCMeeting> getAllByPtsRef(String ptsRef) {
        return bscMeetingDao.findAllByPtsRef(ptsRef);
    }

}
