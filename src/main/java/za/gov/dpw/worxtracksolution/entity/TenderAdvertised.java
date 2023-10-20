package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TenderAdvertised {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenderAdvertisedStatus;
    private Date tenderAdvertisedDate;
    private String ptsRef;
    private String remarks;

    public TenderAdvertised() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenderAdvertisedStatus() {
        return tenderAdvertisedStatus;
    }

    public void setTenderAdvertisedStatus(String tenderAdvertisedStatus) {
        this.tenderAdvertisedStatus = tenderAdvertisedStatus;
    }

//    public String getTenderAdvertisedDate() {
//        return tenderAdvertisedDate;
//    }
//
//    public void setTenderAdvertisedDate(String tenderAdvertisedDate) {
//        this.tenderAdvertisedDate = tenderAdvertisedDate;
//    }


    public Date getTenderAdvertisedDate() {
        return tenderAdvertisedDate;
    }

    public void setTenderAdvertisedDate(Date tenderAdvertisedDate) {
        this.tenderAdvertisedDate = tenderAdvertisedDate;
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
