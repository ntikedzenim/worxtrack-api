package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectCharter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectCharterStatus;
    private String projectCharterDate;
    private String ptsRef;
    private String remarksCharter;

    public ProjectCharter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectCharterStatus() {
        return projectCharterStatus;
    }

    public void setProjectCharterStatus(String projectCharterStatus) {
        this.projectCharterStatus = projectCharterStatus;
    }

    public String getProjectCharterDate() {
        return projectCharterDate;
    }

    public void setProjectCharterDate(String projectCharterDate) {
        this.projectCharterDate = projectCharterDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksCharter() {
        return remarksCharter;
    }

    public void setRemarksCharter(String remarksCharter) {
        this.remarksCharter = remarksCharter;
    }
}
