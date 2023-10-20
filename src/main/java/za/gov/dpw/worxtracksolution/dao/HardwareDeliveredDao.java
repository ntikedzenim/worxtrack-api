package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.HardwareDelivered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HardwareDeliveredDao extends JpaRepository<HardwareDelivered, Long> {

    HardwareDelivered findByPtsRef(String ptsRef);

    List<HardwareDelivered> findAllByPtsRef(String ptsRef);
}
