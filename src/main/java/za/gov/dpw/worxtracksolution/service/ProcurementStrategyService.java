package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ProcurementStrategyDao;
import za.gov.dpw.worxtracksolution.entity.ProcurementStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcurementStrategyService {

    @Autowired
    private ProcurementStrategyDao procurementStrategyDao;

    public ProcurementStrategy saveProcurementStrategy(ProcurementStrategy procurementStrategy){
        return procurementStrategyDao.save(procurementStrategy);
    }

    public List<ProcurementStrategy> getAllByPtsRef(String ptsRef) {
        return procurementStrategyDao.findAllByPtsRef(ptsRef);
    }
}
