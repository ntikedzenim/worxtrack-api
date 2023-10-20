package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ApprovedNBAC2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprovedNBAC2Dao extends JpaRepository<ApprovedNBAC2, Long> {

    ApprovedNBAC2 findByPtsRef(String ptsRef);

    List<ApprovedNBAC2> findAllByPtsRef(String ptsRef);
}
