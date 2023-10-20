package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.NBACFeedbackRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NBACFeedbackRecommendationDao extends JpaRepository<NBACFeedbackRecommendation, Long> {

    NBACFeedbackRecommendation findByPtsRef(String ptsRef);

    List<NBACFeedbackRecommendation> findAllByPtsRef(String ptsRef);
}
