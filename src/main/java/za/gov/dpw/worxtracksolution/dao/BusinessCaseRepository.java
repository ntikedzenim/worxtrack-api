package za.gov.dpw.worxtracksolution.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import za.gov.dpw.worxtracksolution.entity.BusinessCase;
import za.gov.dpw.worxtracksolution.entity.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessCaseRepository extends JpaRepository<BusinessCase, Long> {

    FileModel findFileByBusinessCaseId(Long fileId);

    BusinessCase findByPtsRef(String ptsRef);

    List<BusinessCase> findAllByPtsRef(String ptsRef);

    @Query("SELECT pd, bc FROM ProjectDetails pd INNER JOIN BusinessCase bc ON pd.ptsRef = bc.ptsRef WHERE pd.ptsRef = :ptsRef AND pd.projectManagerEmail = :projectManagerEmail")
    List<Object[]> findProjectDetailsAndBusinessCaseByPtsRefAndProjectManagerEmail(@Param("ptsRef") String ptsRef, @Param("projectManagerEmail") String projectManagerEmail);

}
