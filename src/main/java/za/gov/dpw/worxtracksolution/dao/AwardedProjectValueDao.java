package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.AwardedProjectValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AwardedProjectValueDao extends JpaRepository<AwardedProjectValue, Long> {

    AwardedProjectValue findByPtsRef(String ptsRef);

    List<AwardedProjectValue> findAllByPtsRef(String ptsRef);
}
