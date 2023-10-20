package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BriefingSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String briefingSessionStatus;
    private String briefingSessionDate;
    private String ptsRef;

    public BriefingSession() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBriefingSessionStatus() {
        return briefingSessionStatus;
    }

    public void setBriefingSessionStatus(String briefingSessionStatus) {
        this.briefingSessionStatus = briefingSessionStatus;
    }

    public String getBriefingSessionDate() {
        return briefingSessionDate;
    }

    public void setBriefingSessionDate(String briefingSessionDate) {
        this.briefingSessionDate = briefingSessionDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
