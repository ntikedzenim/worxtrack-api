package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BSCMeetingCorrectionsDao;
import za.gov.dpw.worxtracksolution.entity.BSCMeetingCorrections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BSCMeetingCorrectionsService {

    @Autowired
    private BSCMeetingCorrectionsDao bscMeetingCorrectionsDao;

    public BSCMeetingCorrections saveBSCMeetingCorrections(BSCMeetingCorrections bscMeetingCorrections){
        return bscMeetingCorrectionsDao.save(bscMeetingCorrections);
    }

    public List<BSCMeetingCorrections> getAllByPtsRef(String ptsRef) {
        return bscMeetingCorrectionsDao.findAllByPtsRef(ptsRef);
    }
}
