package za.gov.dpw.worxtracksolution.service;

import za.gov.dpw.worxtracksolution.dao.ProjectDetailsRepository;
import za.gov.dpw.worxtracksolution.entity.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ProjectDetailsService {

    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    public ProjectDetails saveProject(ProjectDetails projectDetails){
        return projectDetailsRepository.save(projectDetails);
    }

    public List<ProjectDetails> getAllProjectDetails(){
        return (List<ProjectDetails>) projectDetailsRepository.findAll();
    }

    public ProjectDetails getProjectById(String ptsRef){
        return projectDetailsRepository.findByPtsRef(ptsRef);
    }

    public ProjectDetails getProjectDetailsById(Long id) {
        return projectDetailsRepository.findById(id).orElse(null);
    }

//    public long getDaysSinceCreation(Long id) {
//        ProjectDetails projectDetails = getProjectDetailsById(id);
//        if (projectDetails != null) {
//            LocalDate startDate = LocalDate.parse(projectDetails.getDateCreated());
//            LocalDate endDate = LocalDate.now();
//            return ChronoUnit.DAYS.between(startDate, endDate);
//        }
//        return -1;
//    }

//    public long getDaysBetweenStartAndEnd(String startDate, String endDate) {
//        LocalDate startDateObj = LocalDate.parse(startDate);
//        LocalDate endDateObj = LocalDate.parse(endDate);
//        return ChronoUnit.DAYS.between(startDateObj, endDateObj);
//    }

    public ProjectDetails updateProject(String ptsRef, ProjectDetails projectDetails){

        // get the product from DB by id
        ProjectDetails existingProductDetails = projectDetailsRepository.findByPtsRef(ptsRef);

        // update with new values from request, if provided
        if (projectDetails.getPtsRef() != null) {
            existingProductDetails.setPtsRef(projectDetails.getPtsRef());
        }
        if (projectDetails.getProjectTitle() != null) {
            existingProductDetails.setProjectTitle(projectDetails.getProjectTitle());
        }
        if (projectDetails.getProjectDescription() != null) {
            existingProductDetails.setProjectDescription(projectDetails.getProjectDescription());
        }
        if (projectDetails.getEstimatedValue() != null) {
            existingProductDetails.setEstimatedValue(projectDetails.getEstimatedValue());
        }
        if (projectDetails.getStartDate() != null) {
            existingProductDetails.setStartDate(projectDetails.getStartDate());
        }
        if (projectDetails.getEndDate() != null) {
            existingProductDetails.setEndDate(projectDetails.getEndDate());
        }
        if (projectDetails.getStatus() != null) {
            existingProductDetails.setStatus(projectDetails.getStatus());
        }
        if (projectDetails.getProjectManager() != null) {
            existingProductDetails.setProjectManager(projectDetails.getProjectManager());
        }
        if (projectDetails.getProjectManagerEmail() != null) {
            existingProductDetails.setProjectManagerEmail(projectDetails.getProjectManagerEmail());
        }
        if (projectDetails.getTechnicalLeader() != null) {
            existingProductDetails.setTechnicalLeader(projectDetails.getTechnicalLeader());
        }
        if (projectDetails.getTechnicalLeaderEmail() != null) {
            existingProductDetails.setTechnicalLeaderEmail(projectDetails.getTechnicalLeaderEmail());
        }
        if (projectDetails.getUnit() != null) {
            existingProductDetails.setUnit(projectDetails.getUnit());
        }
        if (projectDetails.getProjectCategory() != null) {
            existingProductDetails.setProjectCategory(projectDetails.getProjectCategory());
        }
        if (projectDetails.getInHouse() != null) {
            existingProductDetails.setInHouse(projectDetails.getInHouse());
        }
        if (projectDetails.getComments() != null) {
            existingProductDetails.setComments(projectDetails.getComments());
        }
        if (projectDetails.getOutSourced() != null) {
            existingProductDetails.setOutSourced(projectDetails.getOutSourced());
        }
        if (projectDetails.getOtherUnit() != null) {
            existingProductDetails.setOtherUnit(projectDetails.getOtherUnit());
        }
        if (projectDetails.getArchived() != null) {
            existingProductDetails.setArchived(projectDetails.getArchived());
        }
        if (projectDetails.getCompleted() != null) {
            existingProductDetails.setCompleted(projectDetails.getCompleted());
        }
        if (projectDetails.getReason() != null) {
            existingProductDetails.setReason(projectDetails.getReason());
        }

        return projectDetailsRepository.save(existingProductDetails);
    }

    public long countAllProjects(String archived,String completed) {

        return projectDetailsRepository.countByArchivedAndCompleted(archived, completed);
    }

    public long countProjectsByStatus(String status,String archived,String completed) {

        return projectDetailsRepository.countByStatusAndArchivedAndCompleted(status,archived, completed);
    }


    public List<ProjectDetails> getProjectsByTechnicalLeaderEmail(String technicalLeaderEmail) {
        return projectDetailsRepository.findByTechnicalLeaderEmail(technicalLeaderEmail);
    }

//    public long countByOwnerUsernameAndStatus(String username, String status) {
//        return projectDetailsRepository.countByOwner_UserNameAndStatus(username, status);
//    }
//
//    public long countByTechnicalLeaderEmailAndStatus(String email, String status) {
//        return projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(email, status);
//    }

}