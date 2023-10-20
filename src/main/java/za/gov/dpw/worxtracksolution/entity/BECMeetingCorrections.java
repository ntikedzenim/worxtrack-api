package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BECMeetingCorrections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String becMeetingCorrectionsStatus;
    private String becMeetingCorrectionsDate;
    private String ptsRef;

    public BECMeetingCorrections() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBecMeetingCorrectionsStatus() {
        return becMeetingCorrectionsStatus;
    }

    public void setBecMeetingCorrectionsStatus(String becMeetingCorrectionsStatus) {
        this.becMeetingCorrectionsStatus = becMeetingCorrectionsStatus;
    }

    public String getBecMeetingCorrectionsDate() {
        return becMeetingCorrectionsDate;
    }

    public void setBecMeetingCorrectionsDate(String becMeetingCorrectionsDate) {
        this.becMeetingCorrectionsDate = becMeetingCorrectionsDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
