package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.BudgetConfirmationDao;
import za.gov.dpw.worxtracksolution.entity.BudgetConfirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetConfirmationService {

    @Autowired
    private BudgetConfirmationDao budgetConfirmationDao;

    public BudgetConfirmation saveBudgetConfirmation(BudgetConfirmation budgetConfirmation){
        return budgetConfirmationDao.save(budgetConfirmation);
    }

    public List<BudgetConfirmation> getAllByPtsRef(String ptsRef) {
        return budgetConfirmationDao.findAllByPtsRef(ptsRef);
    }
}
