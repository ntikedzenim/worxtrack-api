package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProcurementStrategy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String procurementStrategyStatus;
    private String procurementStrategyDate;
    private String ptsRef;
    private String remarks;


    public ProcurementStrategy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcurementStrategyStatus() {
        return procurementStrategyStatus;
    }

    public void setProcurementStrategyStatus(String procurementStrategyStatus) {
        this.procurementStrategyStatus = procurementStrategyStatus;
    }

    public String getProcurementStrategyDate() {
        return procurementStrategyDate;
    }

    public void setProcurementStrategyDate(String procurementStrategyDate) {
        this.procurementStrategyDate = procurementStrategyDate;
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
