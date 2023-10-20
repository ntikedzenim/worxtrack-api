package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BECMeetingCorrections;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BECMeetingCorrectionsDao extends JpaRepository<BECMeetingCorrections, Long> {

    BECMeetingCorrections findByPtsRef(String ptsRef);

    List<BECMeetingCorrections> findAllByPtsRef(String ptsRef);
}
