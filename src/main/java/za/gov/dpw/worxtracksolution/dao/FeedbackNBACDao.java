package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.FeedbackNBAC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackNBACDao extends JpaRepository<FeedbackNBAC, Long> {

    FeedbackNBAC findByPtsRef(String ptsRef);

    List<FeedbackNBAC> findAllByPtsRef(String ptsRef);
}
