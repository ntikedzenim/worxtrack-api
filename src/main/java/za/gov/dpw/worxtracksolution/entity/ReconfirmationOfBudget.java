package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReconfirmationOfBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reconfirmationBudgetStatus;
    private String reconfirmationBudgetDate;
    private String ptsRef;

    private String remarks;

    public ReconfirmationOfBudget() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReconfirmationBudgetStatus() {
        return reconfirmationBudgetStatus;
    }

    public void setReconfirmationBudgetStatus(String reconfirmationBudgetStatus) {
        this.reconfirmationBudgetStatus = reconfirmationBudgetStatus;
    }

    public String getReconfirmationBudgetDate() {
        return reconfirmationBudgetDate;
    }

    public void setReconfirmationBudgetDate(String reconfirmationBudgetDate) {
        this.reconfirmationBudgetDate = reconfirmationBudgetDate;
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
