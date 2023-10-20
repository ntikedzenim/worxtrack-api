package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BSCMeetingCorrections;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BSCMeetingCorrectionsDao extends JpaRepository<BSCMeetingCorrections, Long> {

    BSCMeetingCorrections findByPtsRef(String ptsRef);

    List<BSCMeetingCorrections> findAllByPtsRef(String ptsRef);
}
