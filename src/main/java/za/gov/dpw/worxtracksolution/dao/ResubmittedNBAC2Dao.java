package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ResubmittedNBAC2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResubmittedNBAC2Dao extends JpaRepository<ResubmittedNBAC2, Long> {

    ResubmittedNBAC2 findByPtsRef(String ptsRef);

    List<ResubmittedNBAC2> findAllByPtsRef(String ptsRef);
}
