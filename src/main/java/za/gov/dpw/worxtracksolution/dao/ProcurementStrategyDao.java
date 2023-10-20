package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ProcurementStrategy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcurementStrategyDao extends JpaRepository<ProcurementStrategy, Long> {

    ProcurementStrategy findByPtsRef(String ptsRef);

    List<ProcurementStrategy> findAllByPtsRef(String ptsRef);
}
