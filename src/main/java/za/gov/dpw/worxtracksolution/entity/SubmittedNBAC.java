package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubmittedNBAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submittedNbacStatus;
    private String submittedNbacDate;
    private String ptsRef;
    private String remarks;

    public SubmittedNBAC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmittedNbacStatus() {
        return submittedNbacStatus;
    }

    public void setSubmittedNbacStatus(String submittedNbacStatus) {
        this.submittedNbacStatus = submittedNbacStatus;
    }

    public String getSubmittedNbacDate() {
        return submittedNbacDate;
    }

    public void setSubmittedNbacDate(String submittedNbacDate) {
        this.submittedNbacDate = submittedNbacDate;
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
