package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ResubmittedNBAC2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resubmittedNbac2Status;
    private String resubmittedNbac2Date;
    private String ptsRef;

    public ResubmittedNBAC2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResubmittedNbac2Status() {
        return resubmittedNbac2Status;
    }

    public void setResubmittedNbac2Status(String resubmittedNbac2Status) {
        this.resubmittedNbac2Status = resubmittedNbac2Status;
    }

    public String getResubmittedNbac2Date() {
        return resubmittedNbac2Date;
    }

    public void setResubmittedNbac2Date(String resubmittedNbac2Date) {
        this.resubmittedNbac2Date = resubmittedNbac2Date;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
