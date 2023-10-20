package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SolutionTesting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String solutionTestingStatus;
    private String solutionTestingDate;
    private String ptsRef;
    private String remarksTesting;

    public SolutionTesting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolutionTestingStatus() {
        return solutionTestingStatus;
    }

    public void setSolutionTestingStatus(String solutionTestingStatus) {
        this.solutionTestingStatus = solutionTestingStatus;
    }

    public String getSolutionTestingDate() {
        return solutionTestingDate;
    }

    public void setSolutionTestingDate(String solutionTestingDate) {
        this.solutionTestingDate = solutionTestingDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksTesting() {
        return remarksTesting;
    }

    public void setRemarksTesting(String remarksTesting) {
        this.remarksTesting = remarksTesting;
    }
}
