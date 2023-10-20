package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ReconfirmationOfBudget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReconfirmationOfBudgetDao extends JpaRepository<ReconfirmationOfBudget, Long> {

    ReconfirmationOfBudget findByPtsRef(String ptsRef);

    List<ReconfirmationOfBudget> findAllByPtsRef(String ptsRef);
}
