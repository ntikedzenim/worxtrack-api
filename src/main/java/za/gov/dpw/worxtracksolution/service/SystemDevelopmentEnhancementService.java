package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.SystemDevelopmentEnhancementDao;
import za.gov.dpw.worxtracksolution.entity.SystemDevelopmentEnhancement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemDevelopmentEnhancementService {

    @Autowired
    private SystemDevelopmentEnhancementDao systemDevelopmentEnhancementDao;

    public SystemDevelopmentEnhancement saveSystemDevelopmentEnhancement(SystemDevelopmentEnhancement systemDevelopmentEnhancement){
        return systemDevelopmentEnhancementDao.save(systemDevelopmentEnhancement);
    }

    public List<SystemDevelopmentEnhancement> getAllByPtsRef(String ptsRef) {
        return systemDevelopmentEnhancementDao.findAllByPtsRef(ptsRef);
    }
}
