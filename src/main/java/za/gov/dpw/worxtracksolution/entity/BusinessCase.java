package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BusinessCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessCaseId;

    private String businessCaseStatus;
    private String businessCaseDate;
    private String ptsRef;
    private String projectTitle;


    public BusinessCase() {
    }

    public Long getBusinessCaseId() {
        return businessCaseId;
    }

    public void setBusinessCaseId(Long businessCaseId) {
        this.businessCaseId = businessCaseId;
    }

    public String getBusinessCaseStatus() {
        return businessCaseStatus;
    }

    public void setBusinessCaseStatus(String businessCaseStatus) {
        this.businessCaseStatus = businessCaseStatus;
    }

    public String getBusinessCaseDate() {
        return businessCaseDate;
    }

    public void setBusinessCaseDate(String businessCaseDate) {
        this.businessCaseDate = businessCaseDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
}
