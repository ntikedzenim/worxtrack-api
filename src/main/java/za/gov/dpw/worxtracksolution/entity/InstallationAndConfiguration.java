package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InstallationAndConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String installationStatus;
    private String installationDate;
    private String ptsRef;

    private String remarksInstallation;

    public InstallationAndConfiguration() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstallationStatus() {
        return installationStatus;
    }

    public void setInstallationStatus(String installationStatus) {
        this.installationStatus = installationStatus;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksInstallation() {
        return remarksInstallation;
    }

    public void setRemarksInstallation(String remarksInstallation) {
        this.remarksInstallation = remarksInstallation;
    }
}
