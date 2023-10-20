package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ToREndorsed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToREndorsedDao extends JpaRepository<ToREndorsed, Long> {

    ToREndorsed findByPtsRef(String ptsRef);

    List<ToREndorsed> findAllByPtsRef(String ptsRef);
}
