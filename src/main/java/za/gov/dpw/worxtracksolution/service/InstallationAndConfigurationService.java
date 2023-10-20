package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.InstallationAndConfigurationDao;
import za.gov.dpw.worxtracksolution.entity.InstallationAndConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallationAndConfigurationService {

    @Autowired
    private InstallationAndConfigurationDao installationAndConfigurationDao;

    public InstallationAndConfiguration saveInstallationAndConfiguration(InstallationAndConfiguration installationAndConfiguration){
        return installationAndConfigurationDao.save(installationAndConfiguration);
    }

    public List<InstallationAndConfiguration> getAllByPtsRef(String ptsRef) {
        return installationAndConfigurationDao.findAllByPtsRef(ptsRef);
    }
}
