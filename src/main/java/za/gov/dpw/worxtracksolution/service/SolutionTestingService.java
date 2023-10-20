package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SolutionTestingDao;
import za.gov.dpw.worxtracksolution.entity.SolutionTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolutionTestingService {

    @Autowired
    private SolutionTestingDao solutionTestingDao;

    public SolutionTesting saveSolutionTesting(SolutionTesting solutionTesting){
        return solutionTestingDao.save(solutionTesting);
    }

    public List<SolutionTesting> getAllByPtsRef(String ptsRef) {
        return solutionTestingDao.findAllByPtsRef(ptsRef);
    }
}
