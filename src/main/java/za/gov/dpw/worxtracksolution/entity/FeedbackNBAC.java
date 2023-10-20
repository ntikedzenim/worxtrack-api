package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedbackNBAC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String feedbackNBACStatus;
    private String feedbackNBACDate;
    private String ptsRef;
    private String remarks;

    public FeedbackNBAC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeedbackNBACStatus() {
        return feedbackNBACStatus;
    }

    public void setFeedbackNBACStatus(String feedbackNBACStatus) {
        this.feedbackNBACStatus = feedbackNBACStatus;
    }

    public String getFeedbackNBACDate() {
        return feedbackNBACDate;
    }

    public void setFeedbackNBACDate(String feedbackNBACDate) {
        this.feedbackNBACDate = feedbackNBACDate;
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
