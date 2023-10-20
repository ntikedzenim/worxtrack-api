package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceLevelAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceLevelStatus;
    private String serviceLevelDate;
    private String ptsRef;
    private String remarksSLA;

    public ServiceLevelAgreement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceLevelStatus() {
        return serviceLevelStatus;
    }

    public void setServiceLevelStatus(String serviceLevelStatus) {
        this.serviceLevelStatus = serviceLevelStatus;
    }

    public String getServiceLevelDate() {
        return serviceLevelDate;
    }

    public void setServiceLevelDate(String serviceLevelDate) {
        this.serviceLevelDate = serviceLevelDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksSLA() {
        return remarksSLA;
    }

    public void setRemarksSLA(String remarksSLA) {
        this.remarksSLA = remarksSLA;
    }
}
