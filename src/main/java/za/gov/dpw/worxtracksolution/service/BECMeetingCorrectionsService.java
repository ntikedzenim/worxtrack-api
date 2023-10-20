package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BECMeetingCorrectionsDao;
import za.gov.dpw.worxtracksolution.entity.BECMeetingCorrections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BECMeetingCorrectionsService {

    @Autowired
    private BECMeetingCorrectionsDao becMeetingCorrectionsDao;

    public BECMeetingCorrections saveBECMeetingCorrections(BECMeetingCorrections becMeetingCorrections){
        return becMeetingCorrectionsDao.save(becMeetingCorrections);
    }

    public List<BECMeetingCorrections> getAllByPtsRef(String ptsRef) {
        return becMeetingCorrectionsDao.findAllByPtsRef(ptsRef);
    }
}
