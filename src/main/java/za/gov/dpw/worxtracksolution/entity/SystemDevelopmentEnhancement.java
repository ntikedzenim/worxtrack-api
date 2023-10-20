package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SystemDevelopmentEnhancement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String systemDevelopmentStatus;
    private String systemDevelopmentDate;
    private String ptsRef;
    private String remarksDevelopment;

    public SystemDevelopmentEnhancement() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemDevelopmentStatus() {
        return systemDevelopmentStatus;
    }

    public void setSystemDevelopmentStatus(String systemDevelopmentStatus) {
        this.systemDevelopmentStatus = systemDevelopmentStatus;
    }

    public String getSystemDevelopmentDate() {
        return systemDevelopmentDate;
    }

    public void setSystemDevelopmentDate(String systemDevelopmentDate) {
        this.systemDevelopmentDate = systemDevelopmentDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksDevelopment() {
        return remarksDevelopment;
    }

    public void setRemarksDevelopment(String remarksDevelopment) {
        this.remarksDevelopment = remarksDevelopment;
    }
}
