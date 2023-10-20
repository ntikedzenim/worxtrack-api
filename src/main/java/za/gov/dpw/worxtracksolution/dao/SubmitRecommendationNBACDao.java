package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.SubmitRecommendationNBAC;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubmitRecommendationNBACDao extends JpaRepository<SubmitRecommendationNBAC, Long> {

    SubmitRecommendationNBAC findByPtsRef(String ptsRef);

    List<SubmitRecommendationNBAC> findAllByPtsRef(String ptsRef);
}
