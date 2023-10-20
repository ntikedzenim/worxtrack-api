package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BudgetConfirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budgetConfirmationStatus;
    private String budgetConfirmationDate;
    private String ptsRef;

    private String remarks;

    public BudgetConfirmation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBudgetConfirmationStatus() {
        return budgetConfirmationStatus;
    }

    public void setBudgetConfirmationStatus(String budgetConfirmationStatus) {
        this.budgetConfirmationStatus = budgetConfirmationStatus;
    }

    public String getBudgetConfirmationDate() {
        return budgetConfirmationDate;
    }

    public void setBudgetConfirmationDate(String budgetConfirmationDate) {
        this.budgetConfirmationDate = budgetConfirmationDate;
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
