package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KickOffMeeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String kickoffMeetingStatus;
    private String kickoffMeetingDate;
    private String ptsRef;
    private String remarksKickoff;

    public KickOffMeeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKickoffMeetingStatus() {
        return kickoffMeetingStatus;
    }

    public void setKickoffMeetingStatus(String kickoffMeetingStatus) {
        this.kickoffMeetingStatus = kickoffMeetingStatus;
    }

    public String getKickoffMeetingDate() {
        return kickoffMeetingDate;
    }

    public void setKickoffMeetingDate(String kickoffMeetingDate) {
        this.kickoffMeetingDate = kickoffMeetingDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksKickoff() {
        return remarksKickoff;
    }

    public void setRemarksKickoff(String remarksKickoff) {
        this.remarksKickoff = remarksKickoff;
    }
}
