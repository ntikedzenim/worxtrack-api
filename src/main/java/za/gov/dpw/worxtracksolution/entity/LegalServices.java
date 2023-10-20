package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LegalServices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String legalServicesStatus;
    private String legalServicesDate;
    private String ptsRef;
    private String remarks;

    public LegalServices() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLegalServicesStatus() {
        return legalServicesStatus;
    }

    public void setLegalServicesStatus(String legalServicesStatus) {
        this.legalServicesStatus = legalServicesStatus;
    }

    public String getLegalServicesDate() {
        return legalServicesDate;
    }

    public void setLegalServicesDate(String legalServicesDate) {
        this.legalServicesDate = legalServicesDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
