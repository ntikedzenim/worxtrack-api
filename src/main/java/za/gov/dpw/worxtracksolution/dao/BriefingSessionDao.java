package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BriefingSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BriefingSessionDao extends JpaRepository<BriefingSession, Long> {

    BriefingSession findByPtsRef(String ptsRef);

    List<BriefingSession> findAllByPtsRef(String ptsRef);
}
