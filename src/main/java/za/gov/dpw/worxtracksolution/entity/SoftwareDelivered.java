package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SoftwareDelivered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String softwareDeliveredStatus;
    private String softwareDeliveredDate;
    private String ptsRef;
    private String remarksSoftware;

    public SoftwareDelivered() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwareDeliveredStatus() {
        return softwareDeliveredStatus;
    }

    public void setSoftwareDeliveredStatus(String softwareDeliveredStatus) {
        this.softwareDeliveredStatus = softwareDeliveredStatus;
    }

    public String getSoftwareDeliveredDate() {
        return softwareDeliveredDate;
    }

    public void setSoftwareDeliveredDate(String softwareDeliveredDate) {
        this.softwareDeliveredDate = softwareDeliveredDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksSoftware() {
        return remarksSoftware;
    }

    public void setRemarksSoftware(String remarksSoftware) {
        this.remarksSoftware = remarksSoftware;
    }
}
