package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SolutionTesting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolutionTestingDao extends JpaRepository<SolutionTesting, Long> {

    SolutionTesting findByPtsRef(String ptsRef);

    List<SolutionTesting> findAllByPtsRef(String ptsRef);
}
