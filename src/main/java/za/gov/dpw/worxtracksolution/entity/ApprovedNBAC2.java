package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApprovedNBAC2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String approvedNBAC2Status;
    private String approvedNBAC2Date;
    private String ptsRef;

    public ApprovedNBAC2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApprovedNBAC2Status() {
        return approvedNBAC2Status;
    }

    public void setApprovedNBAC2Status(String approvedNBAC2Status) {
        this.approvedNBAC2Status = approvedNBAC2Status;
    }

    public String getApprovedNBAC2Date() {
        return approvedNBAC2Date;
    }

    public void setApprovedNBAC2Date(String approvedNBAC2Date) {
        this.approvedNBAC2Date = approvedNBAC2Date;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
