package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SoftwareDeliveredDao;
import za.gov.dpw.worxtracksolution.entity.SoftwareDelivered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareDeliveredService {

    @Autowired
    private SoftwareDeliveredDao softwareDeliveredDao;

    public SoftwareDelivered saveSoftwareDelivered(SoftwareDelivered softwareDelivered){
        return softwareDeliveredDao.save(softwareDelivered);
    }

    public List<SoftwareDelivered> getAllByPtsRef(String ptsRef) {
        return softwareDeliveredDao.findAllByPtsRef(ptsRef);
    }
}
