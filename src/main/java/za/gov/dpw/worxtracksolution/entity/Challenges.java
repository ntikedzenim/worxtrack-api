package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.*;

@Entity
public class Challenges {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 2500)
    private String challengesStatus;
    private String challengesDate;
    private String ptsRef;

    public Challenges() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChallengesStatus() {
        return challengesStatus;
    }

    public void setChallengesStatus(String challengesStatus) {
        this.challengesStatus = challengesStatus;
    }

    public String getChallengesDate() {
        return challengesDate;
    }

    public void setChallengesDate(String challengesDate) {
        this.challengesDate = challengesDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }
}
