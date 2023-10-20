package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AwardLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String awardLetterStatus;
    private String awardLetterDate;
    private String ptsRef;
    private String projectTitle;
    private String remarks;

    public AwardLetter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwardLetterStatus() {
        return awardLetterStatus;
    }

    public void setAwardLetterStatus(String awardLetterStatus) {
        this.awardLetterStatus = awardLetterStatus;
    }

    public String getAwardLetterDate() {
        return awardLetterDate;
    }

    public void setAwardLetterDate(String awardLetterDate) {
        this.awardLetterDate = awardLetterDate;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
