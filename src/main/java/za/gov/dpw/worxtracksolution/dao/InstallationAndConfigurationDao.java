package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.InstallationAndConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstallationAndConfigurationDao extends JpaRepository<InstallationAndConfiguration, Long> {

    InstallationAndConfiguration findByPtsRef(String ptsRef);

    List<InstallationAndConfiguration> findAllByPtsRef(String ptsRef);
}
