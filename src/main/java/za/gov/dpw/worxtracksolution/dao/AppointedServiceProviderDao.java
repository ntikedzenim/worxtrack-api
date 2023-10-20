package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.AppointedServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointedServiceProviderDao extends JpaRepository<AppointedServiceProvider, Long> {

    AppointedServiceProvider findByPtsRef(String ptsRef);


    List<AppointedServiceProvider> findAllByPtsRef(String ptsRef);

    List<AppointedServiceProvider> findAllByPtsRefAndAppointedServiceProviderStatusNotNull(String ptsRef);

}
