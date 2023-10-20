package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ApprovedNBAC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApprovedNBACDao extends JpaRepository<ApprovedNBAC, Long> {

    ApprovedNBAC findByPtsRef(String ptsRef);

    List<ApprovedNBAC> findAllByPtsRef(String ptsRef);
}
