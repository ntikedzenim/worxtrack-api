package za.gov.dpw.worxtracksolution.dao;

import za.gov.dpw.worxtracksolution.entity.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Long> {

    //It is for Reference
    ProjectDetails findTopByOrderByIdDesc();

    //Find by Current User
    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.archived = ?2 AND pd.completed = ?3 ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByOwner_UserName(String projectManagerEmail, String archived, String completed);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = :technicalLeaderEmail  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByTechnicalTechnicalLeaderEmail(@Param("technicalLeaderEmail") String technicalLeaderEmail);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.archived = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByOwner_UserNameAndArchived(String projectManagerEmail, String archived);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.completed = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByOwner_UserNameAndCompleted(String projectManagerEmail, String completed);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = ?1 AND pd.archived = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByTechnicalEmailAndArchived(String technicalLeaderEmail, String archived);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = ?1 AND pd.completed = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByTechnicalEmailAndCompleted(String technicalLeaderEmail, String completed);
    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.status = ?2 AND pd.archived =?3  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByOwner_UserNameAndStatus(String projectManagerEmail, String status, String archived);


    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.status = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByOwner_UserNameAndStatusView(String projectManagerEmail, String status);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = ?1 AND pd.status = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByTechnicalUserNameView(@Param("technicalLeaderEmail") String technicalLeaderEmail, String status);


    @Query("SELECT COUNT(pd) FROM ProjectDetails pd WHERE pd.projectManagerEmail = ?1 AND pd.status = ?2 AND pd.archived = ?3 AND pd.completed = ?4")
    Long countByOwner_UserNameAndStatus(String projectManagerEmail, String status, String archived, String completed);

    @Query("SELECT COUNT(pd) FROM ProjectDetails pd WHERE pd.projectManagerEmail = :projectManagerEmail AND pd.archived = :archived AND pd.completed = :completed")
    Long countByOwner_UserName(@Param("projectManagerEmail") String projectManagerEmail, @Param("archived") String archived, @Param("completed") String completed);


    @Query("SELECT COUNT(pd) FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = ?1 AND pd.status = ?2")
    Long countByTechnicalLeaderEmailAndStatus(@Param("technicalLeaderEmail") String technicalLeaderEmail, String status);

    @Query("SELECT COUNT(pd) FROM ProjectDetails pd WHERE pd.technicalLeaderEmail = :technicalLeaderEmail")
    Long countByTechnicalLeaderEmail(@Param("technicalLeaderEmail") String technicalLeaderEmail);

    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.status = ?1  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findByStatus(String status);



    @Query("SELECT pd FROM ProjectDetails pd WHERE pd.archived = ?1 AND pd.completed = ?2  ORDER BY pd.dateCreated DESC")
    List<ProjectDetails> findAll(String archived, String completed);
    long countByArchivedAndCompleted(String archived,String completed); // Count all projects

    long countByStatusAndArchivedAndCompleted(String status,String archived,String completed);



    // Update Project Status
    ProjectDetails findByPtsRef(String ptsRef);

    List<ProjectDetails> findByProjectManagerEmail(String projectManagerEmail);

    List<ProjectDetails> findByTechnicalLeaderEmail(String technicalLeaderEmail);

}
