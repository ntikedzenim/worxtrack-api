package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AwardedProjectValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String awardedProjectValueStatus;
    private String awardedProjectValueDate;
    private String ptsRef;

    private String remarks;

    public AwardedProjectValue() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwardedProjectValueStatus() {
        return awardedProjectValueStatus;
    }

    public void setAwardedProjectValueStatus(String awardedProjectValueStatus) {
        this.awardedProjectValueStatus = awardedProjectValueStatus;
    }

    public String getAwardedProjectValueDate() {
        return awardedProjectValueDate;
    }

    public void setAwardedProjectValueDate(String awardedProjectValueDate) {
        this.awardedProjectValueDate = awardedProjectValueDate;
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
