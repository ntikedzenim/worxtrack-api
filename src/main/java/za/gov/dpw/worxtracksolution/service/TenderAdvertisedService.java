package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.TenderAdvertisedDao;
import za.gov.dpw.worxtracksolution.entity.TenderAdvertised;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenderAdvertisedService {

    @Autowired
    private TenderAdvertisedDao tenderAdvertisedDao;

    public TenderAdvertised saveTenderAdvertised(TenderAdvertised tenderAdvertised){
        return tenderAdvertisedDao.save(tenderAdvertised);
    }

    public List<TenderAdvertised> getAllByPtsRef(String ptsRef) {
        return tenderAdvertisedDao.findAllByPtsRef(ptsRef);
    }
}
