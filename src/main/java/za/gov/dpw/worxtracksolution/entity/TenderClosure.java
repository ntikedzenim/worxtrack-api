package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TenderClosure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenderClosureStatus;
    private Date tenderClosureDate;
    private String ptsRef;

    public TenderClosure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenderClosureStatus() {
        return tenderClosureStatus;
    }

    public void setTenderClosureStatus(String tenderClosureStatus) {
        this.tenderClosureStatus = tenderClosureStatus;
    }

//    public String getTenderClosureDate() {
//        return tenderClosureDate;
//    }
//
//    public void setTenderClosureDate(String tenderClosureDate) {
//        this.tenderClosureDate = tenderClosureDate;
//    }


    public Date getTenderClosureDate() {
        return tenderClosureDate;
    }

    public void setTenderClosureDate(Date tenderClosureDate) {
        this.tenderClosureDate = tenderClosureDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
