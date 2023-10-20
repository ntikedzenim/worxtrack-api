package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ResubmittedNBAC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResubmittedNBACDao extends JpaRepository<ResubmittedNBAC, Long> {

    ResubmittedNBAC findByPtsRef(String ptsRef);

    List<ResubmittedNBAC> findAllByPtsRef(String ptsRef);
}
