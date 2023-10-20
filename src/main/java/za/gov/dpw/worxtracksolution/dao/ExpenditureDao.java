package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.Expenditure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenditureDao extends JpaRepository<Expenditure, Long> {

    Expenditure findByPtsRef(String ptsRef);

    List<Expenditure> findAllByPtsRef(String ptsRef);
}
