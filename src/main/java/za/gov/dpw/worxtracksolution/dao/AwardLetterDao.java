package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.AwardLetter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AwardLetterDao extends JpaRepository<AwardLetter, Long> {

    AwardLetter findByPtsRef(String ptsRef);

    List<AwardLetter> findAllByPtsRef(String ptsRef);
}
