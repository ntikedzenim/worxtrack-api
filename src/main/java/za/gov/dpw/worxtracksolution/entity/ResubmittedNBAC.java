package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResubmittedNBAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resubmittedNbacStatus;
    private String resubmittedNbacDate;
    private String ptsRef;

    public ResubmittedNBAC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResubmittedNbacStatus() {
        return resubmittedNbacStatus;
    }

    public void setResubmittedNbacStatus(String resubmittedNbacStatus) {
        this.resubmittedNbacStatus = resubmittedNbacStatus;
    }

    public String getResubmittedNbacDate() {
        return resubmittedNbacDate;
    }

    public void setResubmittedNbacDate(String resubmittedNbacDate) {
        this.resubmittedNbacDate = resubmittedNbacDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
