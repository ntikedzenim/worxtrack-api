package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ReconfirmationOfBudgetDao;
import za.gov.dpw.worxtracksolution.entity.ReconfirmationOfBudget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReconfirmationOfBudgetService {

    @Autowired
    private ReconfirmationOfBudgetDao reconfirmationOfBudgetDao;

    public ReconfirmationOfBudget saveReconfirmationOfBudget(ReconfirmationOfBudget reconfirmationOfBudget){
        return reconfirmationOfBudgetDao.save(reconfirmationOfBudget);
    }

    public List<ReconfirmationOfBudget> getAllByPtsRef(String ptsRef) {
        return reconfirmationOfBudgetDao.findAllByPtsRef(ptsRef);
    }
}
