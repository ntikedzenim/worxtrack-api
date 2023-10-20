package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.TenderAdvertised;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TenderAdvertisedDao extends JpaRepository<TenderAdvertised, Long> {

    TenderAdvertised findByPtsRef(String ptsRef);

    List<TenderAdvertised> findAllByPtsRef(String ptsRef);
}
