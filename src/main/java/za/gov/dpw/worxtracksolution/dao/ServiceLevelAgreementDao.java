package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ServiceLevelAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceLevelAgreementDao extends JpaRepository<ServiceLevelAgreement, Long> {

    ServiceLevelAgreement findByPtsRef(String ptsRef);

    List<ServiceLevelAgreement> findAllByPtsRef(String ptsRef);
}
