package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToREndorsed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String torEndorsedStatus;
    private String torEndorsedDate;
    private String ptsRef;
    private String remarks;

    public ToREndorsed() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTorEndorsedStatus() {
        return torEndorsedStatus;
    }

    public void setTorEndorsedStatus(String torEndorsedStatus) {
        this.torEndorsedStatus = torEndorsedStatus;
    }

    public String getTorEndorsedDate() {
        return torEndorsedDate;
    }

    public void setTorEndorsedDate(String torEndorsedDate) {
        this.torEndorsedDate = torEndorsedDate;
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
