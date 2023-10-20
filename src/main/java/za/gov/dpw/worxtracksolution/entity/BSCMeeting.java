package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BSCMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bscMeetingStatus;
    private String bscMeetingDate;
    private String ptsRef;
    private String remarks;



    public BSCMeeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBscMeetingStatus() {
        return bscMeetingStatus;
    }

    public void setBscMeetingStatus(String bscMeetingStatus) {
        this.bscMeetingStatus = bscMeetingStatus;
    }

    public String getBscMeetingDate() {
        return bscMeetingDate;
    }

    public void setBscMeetingDate(String bscMeetingDate) {
        this.bscMeetingDate = bscMeetingDate;
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
