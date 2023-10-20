package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.InformationGatheringDao;
import za.gov.dpw.worxtracksolution.entity.InformationGathering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationGatheringService {

    @Autowired
    private InformationGatheringDao informationGatheringDao;

    public InformationGathering saveInformationGathering(InformationGathering informationGathering){
        return informationGatheringDao.save(informationGathering);
    }

    public List<InformationGathering> getAllByPtsRef(String ptsRef) {
        return informationGatheringDao.findAllByPtsRef(ptsRef);
    }
}
