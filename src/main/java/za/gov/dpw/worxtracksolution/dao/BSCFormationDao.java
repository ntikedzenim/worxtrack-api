package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BSCFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BSCFormationDao extends JpaRepository<BSCFormation, Long> {

    BSCFormation findByPtsRef(String ptsRef);

    List<BSCFormation> findAllByPtsRef(String ptsRef);
}
