package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArchitecturalDesign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String architecturalDesignStatus;
    private String architecturalDesignDate;
    private String ptsRef;
    private String remarksFRS;

    public ArchitecturalDesign() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArchitecturalDesignStatus() {
        return architecturalDesignStatus;
    }

    public void setArchitecturalDesignStatus(String architecturalDesignStatus) {
        this.architecturalDesignStatus = architecturalDesignStatus;
    }

    public String getArchitecturalDesignDate() {
        return architecturalDesignDate;
    }

    public void setArchitecturalDesignDate(String architecturalDesignDate) {
        this.architecturalDesignDate = architecturalDesignDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksFRS() {
        return remarksFRS;
    }

    public void setRemarksFRS(String remarksFRS) {
        this.remarksFRS = remarksFRS;
    }
}
