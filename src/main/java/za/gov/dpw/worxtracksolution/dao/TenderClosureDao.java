package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.TenderClosure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TenderClosureDao extends JpaRepository<TenderClosure, Long> {

    TenderClosure findByPtsRef(String ptsRef);

    List<TenderClosure> findAllByPtsRef(String ptsRef);
}
