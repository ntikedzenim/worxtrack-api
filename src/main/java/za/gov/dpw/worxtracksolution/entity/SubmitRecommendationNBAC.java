package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubmitRecommendationNBAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submitRecommendationNbacStatus;
    private String submitRecommendationNbacDate;
    private String ptsRef;
    private String remarks;


    public SubmitRecommendationNBAC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmitRecommendationNbacStatus() {
        return submitRecommendationNbacStatus;
    }

    public void setSubmitRecommendationNbacStatus(String submitRecommendationNbacStatus) {
        this.submitRecommendationNbacStatus = submitRecommendationNbacStatus;
    }

    public String getSubmitRecommendationNbacDate() {
        return submitRecommendationNbacDate;
    }

    public void setSubmitRecommendationNbacDate(String submitRecommendationNbacDate) {
        this.submitRecommendationNbacDate = submitRecommendationNbacDate;
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
