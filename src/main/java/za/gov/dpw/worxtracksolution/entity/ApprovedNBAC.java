package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.*;

@Entity
public class ApprovedNBAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2500)
    private String approvedNBACStatus;
    private String approvedNBACDate;
    private String ptsRef;

    public ApprovedNBAC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApprovedNBACStatus() {
        return approvedNBACStatus;
    }

    public void setApprovedNBACStatus(String approvedNBACStatus) {
        this.approvedNBACStatus = approvedNBACStatus;
    }

    public String getApprovedNBACDate() {
        return approvedNBACDate;
    }

    public void setApprovedNBACDate(String approvedNBACDate) {
        this.approvedNBACDate = approvedNBACDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
