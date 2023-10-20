package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ExpenditureDao;
import za.gov.dpw.worxtracksolution.entity.Expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenditureService {

    @Autowired
    private ExpenditureDao expenditureDao;

    public Expenditure saveExpenditure(Expenditure expenditure){
        return expenditureDao.save(expenditure);
    }

    public List<Expenditure> getAllByPtsRef(String ptsRef) {
        return expenditureDao.findAllByPtsRef(ptsRef);
    }
}
