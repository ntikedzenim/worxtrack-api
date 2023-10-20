package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SystemDevelopmentEnhancement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemDevelopmentEnhancementDao extends JpaRepository<SystemDevelopmentEnhancement, Long> {

    SystemDevelopmentEnhancement findByPtsRef(String ptsRef);

    List<SystemDevelopmentEnhancement> findAllByPtsRef(String ptsRef);
}
