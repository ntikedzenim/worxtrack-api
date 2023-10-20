package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BSCMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BSCMeetingDao extends JpaRepository<BSCMeeting, Long> {

    BSCMeeting findByPtsRef(String ptsRef);

    List<BSCMeeting> findAllByPtsRef(String ptsRef);

}
