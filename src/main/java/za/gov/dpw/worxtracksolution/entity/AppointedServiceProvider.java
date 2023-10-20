package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppointedServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String appointedServiceProviderStatus;
    private String appointedServiceProviderDate;
    private String ptsRef;
    private String remarksAppointed;

    public AppointedServiceProvider() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppointedServiceProviderStatus() {
        return appointedServiceProviderStatus;
    }

    public void setAppointedServiceProviderStatus(String appointedServiceProviderStatus) {
        this.appointedServiceProviderStatus = appointedServiceProviderStatus;
    }

    public String getAppointedServiceProviderDate() {
        return appointedServiceProviderDate;
    }

    public void setAppointedServiceProviderDate(String appointedServiceProviderDate) {
        this.appointedServiceProviderDate = appointedServiceProviderDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksAppointed() {
        return remarksAppointed;
    }

    public void setRemarksAppointed(String remarksAppointed) {
        this.remarksAppointed = remarksAppointed;
    }
}
