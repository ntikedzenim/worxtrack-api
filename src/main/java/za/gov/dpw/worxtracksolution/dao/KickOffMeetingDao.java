package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.KickOffMeeting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KickOffMeetingDao extends JpaRepository<KickOffMeeting, Long> {

    KickOffMeeting findByPtsRef(String ptsRef);

    List<KickOffMeeting> findAllByPtsRef(String ptsRef);
}
