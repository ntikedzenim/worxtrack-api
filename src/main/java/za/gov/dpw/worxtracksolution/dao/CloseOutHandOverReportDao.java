package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.CloseOutHandOverReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloseOutHandOverReportDao extends JpaRepository<CloseOutHandOverReport, Long> {

    CloseOutHandOverReport findByPtsRef(String ptsRef);

    List<CloseOutHandOverReport> findAllByPtsRef(String ptsRef);
}
