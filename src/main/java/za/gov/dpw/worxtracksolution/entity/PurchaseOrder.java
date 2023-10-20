package za.gov.dpw.worxtracksolution.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String purchaseOrderStatus;
    private String purchasedOrderDate;
    private String ptsRef;
    private String remarksPurchase;

    public PurchaseOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    public void setPurchaseOrderStatus(String purchaseOrderStatus) {
        this.purchaseOrderStatus = purchaseOrderStatus;
    }

    public String getPurchasedOrderDate() {
        return purchasedOrderDate;
    }

    public void setPurchasedOrderDate(String purchasedOrderDate) {
        this.purchasedOrderDate = purchasedOrderDate;
    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getRemarksPurchase() {
        return remarksPurchase;
    }

    public void setRemarksPurchase(String remarksPurchase) {
        this.remarksPurchase = remarksPurchase;
    }
}
