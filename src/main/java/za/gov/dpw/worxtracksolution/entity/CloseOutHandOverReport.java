package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CloseOutHandOverReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String closeOutStatus;
    private String closeoutDate;
    private String ptsRef;
    private String remarksClose;

    public CloseOutHandOverReport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCloseOutStatus() {
        return closeOutStatus;
    }

    public void setCloseOutStatus(String closeOutStatus) {
        this.closeOutStatus = closeOutStatus;
    }

    public String getCloseoutDate() {
        return closeoutDate;
    }

    public void setCloseoutDate(String closeoutDate) {
        this.closeoutDate = closeoutDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksClose() {
        return remarksClose;
    }

    public void setRemarksClose(String remarksClose) {
        this.remarksClose = remarksClose;
    }
}
