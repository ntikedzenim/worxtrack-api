package za.gov.dpw.worxtracksolution.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import za.gov.dpw.worxtracksolution.entity.OnHoldStatusChange;

import java.util.List;

public interface OnHoldStatusChangeDao extends JpaRepository<OnHoldStatusChange, Long> {

    @Query("SELECT os FROM OnHoldStatusChange os WHERE os.ptsRef = :ptsRef")
    List<OnHoldStatusChange> selectByPtsRef(@Param("ptsRef") String ptsRef);
}
