package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ProgressToDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgressToDateDao extends JpaRepository<ProgressToDate, Long> {

    ProgressToDate findByPtsRef(String ptsRef);

    List<ProgressToDate> findAllByPtsRef(String ptsRef);
}
