package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String expenditureStatus;
    private String expenditureDate;
    private String ptsRef;
    private String remarksEx;

    public Expenditure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenditureStatus() {
        return expenditureStatus;
    }

    public void setExpenditureStatus(String expenditureStatus) {
        this.expenditureStatus = expenditureStatus;
    }

    public String getExpenditureDate() {
        return expenditureDate;
    }

    public void setExpenditureDate(String expenditureDate) {
        this.expenditureDate = expenditureDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksEx() {
        return remarksEx;
    }

    public void setRemarksEx(String remarksEx) {
        this.remarksEx = remarksEx;
    }
}
