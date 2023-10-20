package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardwareDelivered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hardwareDeliveredStatus;
    private String hardwareDeliveredDate;
    private String ptsRef;
    private String remarksHardware;

    public HardwareDelivered() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHardwareDeliveredStatus() {
        return hardwareDeliveredStatus;
    }

    public void setHardwareDeliveredStatus(String hardwareDeliveredStatus) {
        this.hardwareDeliveredStatus = hardwareDeliveredStatus;
    }

    public String getHardwareDeliveredDate() {
        return hardwareDeliveredDate;
    }

    public void setHardwareDeliveredDate(String hardwareDeliveredDate) {
        this.hardwareDeliveredDate = hardwareDeliveredDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksHardware() {
        return remarksHardware;
    }

    public void setRemarksHardware(String remarksHardware) {
        this.remarksHardware = remarksHardware;
    }
}
