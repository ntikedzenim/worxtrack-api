package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BECMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String becMeetingStatus;
    private String becMeetingDate;
    private String ptsRef;

    private String remarks;

    public BECMeeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBecMeetingStatus() {
        return becMeetingStatus;
    }

    public void setBecMeetingStatus(String becMeetingStatus) {
        this.becMeetingStatus = becMeetingStatus;
    }

    public String getBecMeetingDate() {
        return becMeetingDate;
    }

    public void setBecMeetingDate(String becMeetingDate) {
        this.becMeetingDate = becMeetingDate;
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
