package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.LegalServices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LegalServicesDao extends JpaRepository<LegalServices, Long> {

    LegalServices findByPtsRef(String ptsRef);

    List<LegalServices> findAllByPtsRef(String ptsRef);
}
