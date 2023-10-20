package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BSCMeetingCorrections {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bscMeetingCorrectionsStatus;
    private String bscMeetingCorrectionsDate;
    private String ptsRef;

    public BSCMeetingCorrections() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBscMeetingCorrectionsStatus() {
        return bscMeetingCorrectionsStatus;
    }

    public void setBscMeetingCorrectionsStatus(String bscMeetingCorrectionsStatus) {
        this.bscMeetingCorrectionsStatus = bscMeetingCorrectionsStatus;
    }

    public String getBscMeetingCorrectionsDate() {
        return bscMeetingCorrectionsDate;
    }

    public void setBscMeetingCorrectionsDate(String bscMeetingCorrectionsDate) {
        this.bscMeetingCorrectionsDate = bscMeetingCorrectionsDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
