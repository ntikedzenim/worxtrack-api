package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.InformationGathering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformationGatheringDao extends JpaRepository<InformationGathering, Long> {

    InformationGathering findByPtsRef(String ptsRef);

    List<InformationGathering> findAllByPtsRef(String ptsRef);
}
