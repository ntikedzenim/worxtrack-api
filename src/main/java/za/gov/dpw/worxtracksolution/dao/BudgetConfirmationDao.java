package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.BudgetConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetConfirmationDao extends JpaRepository<BudgetConfirmation, Long> {

    BudgetConfirmation findByPtsRef(String ptsRef);

    List<BudgetConfirmation> findAllByPtsRef(String ptsRef);
}
