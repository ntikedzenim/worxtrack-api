package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SCMPractitioner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SCMPractitionerDao extends JpaRepository<SCMPractitioner, Long> {

    SCMPractitioner findByPtsRef(String ptsRef);

    List<SCMPractitioner> findAllByPtsRef(String ptsRef);
}
