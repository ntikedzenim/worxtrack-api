package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.PurchaseOrderDao;
import za.gov.dpw.worxtracksolution.entity.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseOrderService {

    @Autowired
    private PurchaseOrderDao purchaseOrderDao;

    public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseOrder){
        return purchaseOrderDao.save(purchaseOrder);
    }

    public List<PurchaseOrder> getAllByPtsRef(String ptsRef) {
        return purchaseOrderDao.findAllByPtsRef(ptsRef);
    }
}
