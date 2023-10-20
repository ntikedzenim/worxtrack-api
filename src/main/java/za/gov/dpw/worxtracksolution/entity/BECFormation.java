package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BECFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String becFormationStatus;
    private String becFormationDate;
    private String ptsRef;

    public BECFormation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBecFormationStatus() {
        return becFormationStatus;
    }

    public void setBecFormationStatus(String becFormationStatus) {
        this.becFormationStatus = becFormationStatus;
    }

    public String getBecFormationDate() {
        return becFormationDate;
    }

    public void setBecFormationDate(String becFormationDate) {
        this.becFormationDate = becFormationDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
