package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SubmittedNBAC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubmittedNBACDao extends JpaRepository<SubmittedNBAC, Long> {

    SubmittedNBAC findByPtsRef(String ptsRef);

    List<SubmittedNBAC> findAllByPtsRef(String ptsRef);
}
