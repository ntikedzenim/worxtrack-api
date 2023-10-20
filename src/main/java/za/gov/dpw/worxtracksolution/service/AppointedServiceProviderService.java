package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.AppointedServiceProviderDao;
import za.gov.dpw.worxtracksolution.entity.AppointedServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointedServiceProviderService {

    @Autowired
    private AppointedServiceProviderDao appointedServiceProviderDao;

//    public AppointedServiceProvider saveServiceProvider(AppointedServiceProvider appointedServiceProvider){
//        AppointedServiceProvider existingServiceProvider = appointedServiceProviderDao.findByPtsRef(appointedServiceProvider.getPtsRef());
//
//        if(existingServiceProvider != null){
//            existingServiceProvider.setAppointedServiceProviderStatus(appointedServiceProvider.getAppointedServiceProviderStatus());
//            existingServiceProvider.setAppointedServiceProviderDate(appointedServiceProvider.getAppointedServiceProviderDate());
//
//            return appointedServiceProviderDao.save(appointedServiceProvider);
//        }else {
//            return appointedServiceProviderDao.save(appointedServiceProvider);
//        }
//    }

    public AppointedServiceProvider saveServiceProvider(AppointedServiceProvider appointedServiceProvider){
        return appointedServiceProviderDao.save(appointedServiceProvider);
    }

    public List<AppointedServiceProvider> getAllByPtsRef(String ptsRef) {
        return appointedServiceProviderDao.findAllByPtsRef(ptsRef);
    }

    public List<AppointedServiceProvider> getAllByPtsRefAndStatusNotNull(String ptsRef) {
        return appointedServiceProviderDao.findAllByPtsRefAndAppointedServiceProviderStatusNotNull(ptsRef);
    }
}
