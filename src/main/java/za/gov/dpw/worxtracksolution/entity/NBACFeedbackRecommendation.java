package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NBACFeedbackRecommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nbacFeedbackRecommendationStatus;
    private String nbacFeedbackRecommendationDate;
    private String ptsRef;

    private String remarks;

    public NBACFeedbackRecommendation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNbacFeedbackRecommendationStatus() {
        return nbacFeedbackRecommendationStatus;
    }

    public void setNbacFeedbackRecommendationStatus(String nbacFeedbackRecommendationStatus) {
        this.nbacFeedbackRecommendationStatus = nbacFeedbackRecommendationStatus;
    }

    public String getNbacFeedbackRecommendationDate() {
        return nbacFeedbackRecommendationDate;
    }

    public void setNbacFeedbackRecommendationDate(String nbacFeedbackRecommendationDate) {
        this.nbacFeedbackRecommendationDate = nbacFeedbackRecommendationDate;
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
