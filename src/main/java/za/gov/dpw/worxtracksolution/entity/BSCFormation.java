package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BSCFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bscFormationStatus;
    private String bscFormationDate;
    private String ptsRef;

    public BSCFormation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBscFormationStatus() {
        return bscFormationStatus;
    }

    public void setBscFormationStatus(String bscFormationStatus) {
        this.bscFormationStatus = bscFormationStatus;
    }

    public String getBscFormationDate() {
        return bscFormationDate;
    }

    public void setBscFormationDate(String bscFormationDate) {
        this.bscFormationDate = bscFormationDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
