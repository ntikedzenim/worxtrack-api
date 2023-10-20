package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InformationGathering {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String informationGatheringStatus;
    private String informationGatheringDate;
    private String ptsRef;
    private String remarksURS;

    public InformationGathering() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformationGatheringStatus() {
        return informationGatheringStatus;
    }

    public void setInformationGatheringStatus(String informationGatheringStatus) {
        this.informationGatheringStatus = informationGatheringStatus;
    }

    public String getInformationGatheringDate() {
        return informationGatheringDate;
    }

    public void setInformationGatheringDate(String informationGatheringDate) {
        this.informationGatheringDate = informationGatheringDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksURS() {
        return remarksURS;
    }

    public void setRemarksURS(String remarksURS) {
        this.remarksURS = remarksURS;
    }
}
