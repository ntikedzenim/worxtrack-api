package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.Challenges;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChallengesDao extends JpaRepository<Challenges, Long> {

    Challenges findByPtsRef(String ptsRef);

    List<Challenges> findAllByPtsRef(String ptsRef);
}
