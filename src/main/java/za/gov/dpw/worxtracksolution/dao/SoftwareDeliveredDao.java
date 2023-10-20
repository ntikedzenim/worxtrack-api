package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SoftwareDelivered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SoftwareDeliveredDao extends JpaRepository<SoftwareDelivered, Long> {

    SoftwareDelivered findByPtsRef(String ptsRef);

    List<SoftwareDelivered> findAllByPtsRef(String ptsRef);
}
