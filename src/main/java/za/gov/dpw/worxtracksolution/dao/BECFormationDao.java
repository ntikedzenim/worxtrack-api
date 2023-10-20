package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BECFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BECFormationDao extends JpaRepository<BECFormation, Long> {

    BECFormation findByPtsRef(String ptsRef);

    List<BECFormation> findAllByPtsRef(String ptsRef);
}
