package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SCMPractitioner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scmPractitionerStatus;
    private String scmPractitionerDate;
    private String ptsRef;

    public SCMPractitioner() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScmPractitionerStatus() {
        return scmPractitionerStatus;
    }

    public void setScmPractitionerStatus(String scmPractitionerStatus) {
        this.scmPractitionerStatus = scmPractitionerStatus;
    }

    public String getScmPractitionerDate() {
        return scmPractitionerDate;
    }

    public void setScmPractitionerDate(String scmPractitionerDate) {
        this.scmPractitionerDate = scmPractitionerDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
