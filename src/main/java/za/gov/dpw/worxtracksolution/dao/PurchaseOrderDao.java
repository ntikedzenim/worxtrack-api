package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseOrderDao extends JpaRepository<PurchaseOrder, Long> {

    PurchaseOrder findByPtsRef(String ptsRef);

    List<PurchaseOrder> findAllByPtsRef(String ptsRef);
}
