package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.HardwareDeliveredDao;
import za.gov.dpw.worxtracksolution.entity.HardwareDelivered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardwareDeliveredService {

    @Autowired
    private HardwareDeliveredDao hardwareDeliveredDao;

    public HardwareDelivered saveHardwareDelivered(HardwareDelivered hardwareDelivered){
        return hardwareDeliveredDao.save(hardwareDelivered);
    }

    public List<HardwareDelivered> getAllByPtsRef(String ptsRef) {
        return hardwareDeliveredDao.findAllByPtsRef(ptsRef);
    }
}
