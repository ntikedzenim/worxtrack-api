package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BECMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BECMeetingDao extends JpaRepository<BECMeeting, Long> {

    BECMeeting findByPtsRef(String ptsRef);

    List<BECMeeting> findAllByPtsRef(String ptsRef);
}
