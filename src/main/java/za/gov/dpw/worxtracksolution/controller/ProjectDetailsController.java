package za.gov.dpw.worxtracksolution.controller;


import org.springframework.dao.DataIntegrityViolationException;
import za.gov.dpw.worxtracksolution.dao.ProjectDetailsRepository;
import za.gov.dpw.worxtracksolution.entity.ADdetails;
import za.gov.dpw.worxtracksolution.entity.ActAsAD;
import za.gov.dpw.worxtracksolution.entity.ProjectDetails;
import za.gov.dpw.worxtracksolution.service.ADdetailsService;
import za.gov.dpw.worxtracksolution.service.ActAsAdService;
import za.gov.dpw.worxtracksolution.service.BusinessCaseService;
import za.gov.dpw.worxtracksolution.service.ProjectDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.NamingException;
import java.security.Principal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/project")
@CrossOrigin
public class ProjectDetailsController {

    @Autowired
    private ProjectDetailsService projectDetailsService;

    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    @Autowired
    private BusinessCaseService businessCaseService;

    @Autowired
    private ADdetailsService aDdetailsService;

    @Autowired
    private ActAsAdService actAsAdService;

//    @PreAuthorize("hasRole('Project_Manager')")
//    @PostMapping("/addProject")
//    public ResponseEntity<ProjectDetails> saveProject(@RequestBody ProjectDetails projectDetails) {
//
//        // Set the reference number
//        ProjectDetails latestProject = projectDetailsRepository.findTopByOrderByIdDesc();
//        Long latestId = latestProject != null ? latestProject.getId() : 0;
//        String latestIdStr = String.valueOf(latestId);
//
//        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        String referenceNumber = String.format("PTS-%s-%d", date, latestId + 1);
//        projectDetails.setPtsRef(referenceNumber);
//
//        // Set the status field to "Waiting For Business Case"
//        projectDetails.setStatus("Waiting for Business Case");
//
//        // Set archived to false for new projects
//        projectDetails.setArchived("false");
//        projectDetails.setCompleted("unfulfilled");
//
//        ProjectDetails savedProjectDetails = projectDetailsService.saveProject(projectDetails);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedProjectDetails);
//    }

    @PostMapping("/addProject")
    public ResponseEntity<?> saveProject(@RequestBody ProjectDetails projectDetails) {
        try {
            // Set the reference number
            ProjectDetails latestProject = projectDetailsRepository.findTopByOrderByIdDesc();
            Long latestId = latestProject != null ? latestProject.getId() : 0;
            String latestIdStr = String.valueOf(latestId);

            String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            String referenceNumber = String.format("PTS-%s-%d", date, latestId + 1);
            projectDetails.setPtsRef(referenceNumber);

            // Set the status field to "Waiting For Business Case"
            projectDetails.setStatus("Waiting for Business Case");

            // Set archived to false for new projects
            projectDetails.setArchived("false");
            projectDetails.setCompleted("unfulfilled");

            ProjectDetails savedProjectDetails = projectDetailsService.saveProject(projectDetails);

            return ResponseEntity.status(HttpStatus.CREATED).body(savedProjectDetails);
        } catch (DataIntegrityViolationException ex) {
            // Return a user-friendly error message
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Project with the same title already exists.");
        }
    }



    //    @PreAuthorize("hasRole('Project_Manager')")
    @GetMapping("/getProjectsByCurrentUser/{projectManagerEmail}")
    public List<ProjectDetails> getProjectsByCurrentUser(@PathVariable String projectManagerEmail) {

        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserName(projectManagerEmail, archived, completed);

        return projects;
    }

//    @PreAuthorize("hasRole('Project_Manager')")
    @GetMapping("/getProjectsByCurrentUserArchived/{projectManagerEmail}")
    public List<ProjectDetails> getProjectsByCurrentUserAndArchived(@PathVariable String projectManagerEmail) {

        String archived = "true";

        // Retrieve projects owned by the current user and filtered by archived status
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndArchived(projectManagerEmail, archived);

        return projects;
    }

//    @PreAuthorize("hasRole('Project_Manager')")
    @GetMapping("/getProjectsByCurrentUserCompleted/{projectManagerEmail}")
    public List<ProjectDetails> getProjectsByCurrentUserAndCompleted(@PathVariable String projectManagerEmail) {

        String completed = "Completed";

        // Retrieve projects owned by the current user and filtered by completed status
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndCompleted(projectManagerEmail,completed);

        return projects;
    }


//    @PreAuthorize("hasRole('Technical_Leader')")
    @GetMapping("/technicalLeader/{technicalLeaderEmail}")
    public List<ProjectDetails> getProjectsByTechnicalUser(@PathVariable String technicalLeaderEmail) {

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalTechnicalLeaderEmail(technicalLeaderEmail);

        return projects;
    }

    //    @PreAuthorize("hasRole('Project_Manager')")
    @GetMapping("/getProjectsByTechnicalArchived/{technicalLeaderEmail}")
    public List<ProjectDetails> getProjectsByTechArchived(@PathVariable String technicalLeaderEmail) {

        String archived = "true";

        // Retrieve projects owned by the current user and filtered by archived status
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalEmailAndArchived(technicalLeaderEmail, archived);

        return projects;
    }

    //    @PreAuthorize("hasRole('Project_Manager')")
    @GetMapping("/getProjectsByTechnicalCompleted/{technicalLeaderEmail}")
    public List<ProjectDetails> getProjectsByTechnicalCompleted(@PathVariable String technicalLeaderEmail) {

        String completed = "Completed";

        // Retrieve projects owned by the current user and filtered by completed status
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalEmailAndCompleted(technicalLeaderEmail,completed);

        return projects;
    }


    @GetMapping("/getAllProjectsDetails")
    public List<ProjectDetails> findAll() {

        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findAll(archived, completed);

        return projects;
    }

    @GetMapping("/getAllClosedProjectsDetails")
    public List<ProjectDetails> findAllClosed() {

        String archived = "true";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findAll(archived, completed);

        return projects;
    }

    @GetMapping("/getAllCompletedProjectsDetails")
    public List<ProjectDetails> findAllCompleted() {

        String archived = "false";
        String completed = "Completed";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findAll(archived, completed);

        return projects;
    }


    @GetMapping("/getProjectsDetailsById/{ptsRef}")
    public ProjectDetails getProjectDetailsById(@PathVariable String ptsRef){
        return projectDetailsService.getProjectById(ptsRef);
    }

//    @PreAuthorize("hasRole('Admin','User')")
    @PutMapping("/updateProjectDetails/{ptsRef}")
    public ProjectDetails updateProject(@PathVariable String ptsRef, @RequestBody ProjectDetails projectDetails){
        return projectDetailsService.updateProject(ptsRef,projectDetails);
    }

//    @GetMapping("/days-since-creation/{ptsRef}")
//    public ResponseEntity<Long> getDaysSinceCreation(@PathVariable String ptsRef) {
//        ProjectDetails project = projectDetailsService.getProjectById(ptsRef);
//
//        if (project == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//
//        // Check if the project status is one of the statuses that stop counting
//        String status = project.getStatus();
//        if (status.equals("Completed") || status.equals("On Hold") || status.equals("Cancelled")) {
//            return new ResponseEntity<>(0L, HttpStatus.OK);
//        }
//
//        long daysSinceCreation = projectDetailsService.getDaysSinceCreation(project.getId());
//        if (daysSinceCreation >= 0) {
//            return new ResponseEntity<>(daysSinceCreation, HttpStatus.OK);
//        }
//
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }

//    @GetMapping("/calculate-days-between/{ptsRef}")
//    public ResponseEntity<Long> calculateDaysBetween(
//            @PathVariable String ptsRef) {
//        try {
//            // Get the project details by ptsRef
//            ProjectDetails project = projectDetailsService.getProjectById(ptsRef);
//
//            if (project == null) {
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//
//            LocalDate startDateObj = LocalDate.parse(project.getStartDate());
//            LocalDate endDateObj = LocalDate.parse(project.getEndDate());
//            long daysBetween = ChronoUnit.DAYS.between(startDateObj, endDateObj);
//            return new ResponseEntity<>(daysBetween, HttpStatus.OK);
//        } catch (Exception e) {
//            // Handle invalid date format, ptsRef not found, or other exceptions here
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }



    @GetMapping("/all/procurement-in-progress")
    public List<ProjectDetails> getAllProjectsInProcurementInProgress() {

        String status = "Procurement in Progress";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByStatus(status);

        return projects;
    }

    @GetMapping("/all/implementation-in-progress")
    public List<ProjectDetails> getAllProjectsInImplementationInProgress() {

        String status = "Implementation in Progress";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByStatus(status);

        return projects;
    }

    @GetMapping("/all/completed")
    public List<ProjectDetails> getAllProjectsCompleted() {

        String status = "Completed";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByStatus(status);

        return projects;
    }

    @GetMapping("/all/hold")
    public List<ProjectDetails> getAllProjectsHold() {

        String status = "On Hold";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByStatus(status);

        return projects;
    }

    @GetMapping("/all/cancelled")
    public List<ProjectDetails> getAllProjectsCancelled() {

        String status = "Cancelled";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByStatus(status);

        return projects;
    }

//Project Manager

    @GetMapping("/procurement-in-progress/{projectManagerEmail}")
    public List<ProjectDetails> getProjectsInProcurementInProgress(@PathVariable String projectManagerEmail) {

        String status = "Procurement in Progress";
        String archived = "false";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatus(projectManagerEmail, status, archived);

        return projects;
    }

    @GetMapping("/implementation-in-progress/{projectManagerEmail}")
    public List<ProjectDetails> getProjectsInImplementationInProgress(@PathVariable String projectManagerEmail) {

        String status = "Implementation in Progress";
        String archived = "false";

        // Retrieve projects owned by the current user with the specified status
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatus(projectManagerEmail, status, archived);

        return projects;
    }


    @GetMapping("/view-implementation/{projectManagerEmail}")
    public List<ProjectDetails> getByOwner_UserNameAndStatusView(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Implementation in Progress";

        // Retrieve projects owned by the current user with the specified statuses
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatusView(projectManagerEmail, status);

        return projects;
    }

    @GetMapping("/view-procurement/{projectManagerEmail}")
    public List<ProjectDetails> getByOwner_UserNameAndStatusViewProcurement(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Procurement in Progress";

        // Retrieve projects owned by the current user with the specified statuses
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatusView(projectManagerEmail, status);

        return projects;
    }

    @GetMapping("/view-completed/{projectManagerEmail}")
    public List<ProjectDetails> getByOwner_UserNameAndStatusViewCompleted(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Completed";

        // Retrieve projects owned by the current user with the specified statuses
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatusView(projectManagerEmail, status);

        return projects;
    }

    @GetMapping("/view-hold/{projectManagerEmail}")
    public List<ProjectDetails> getByOwner_UserNameAndStatusViewHold(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "On Hold";

        // Retrieve projects owned by the current user with the specified statuses
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatusView(projectManagerEmail, status);

        return projects;
    }

    @GetMapping("/view-cancelled/{projectManagerEmail}")
    public List<ProjectDetails> getByOwner_UserNameAndStatusViewCancelled(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Cancelled";

        // Retrieve projects owned by the current user with the specified statuses
        List<ProjectDetails> projects = projectDetailsRepository.findByOwner_UserNameAndStatusView(projectManagerEmail, status);

        return projects;
    }

    // Technical Leader

    @GetMapping("/technical/procurement/{technicalLeaderEmail}")
    public List<ProjectDetails> findByTechnicalUserNameViewProcurement(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Procurement in Progress";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalUserNameView(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/technical/implementation/{technicalLeaderEmail}")
    public List<ProjectDetails> findByTechnicalUserNameViewImplementation(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Implementation in Progress";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalUserNameView(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/technical/completed/{technicalLeaderEmail}")
    public List<ProjectDetails> findByTechnicalUserNameViewCompleted(@PathVariable String technicalLeaderEmail) {
        // Define the statuses to include
        String status = "Completed";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalUserNameView(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/technical/hold/{technicalLeaderEmail}")
    public List<ProjectDetails> findByTechnicalUserNameViewHold(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "On Hold";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalUserNameView(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/technical/cancelled/{technicalLeaderEmail}")
    public List<ProjectDetails> findByTechnicalUserNameViewCancelled(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Cancelled";

        // Retrieve projects owned by the current user
        List<ProjectDetails> projects = projectDetailsRepository.findByTechnicalUserNameView(technicalLeaderEmail, status);

        return projects;
    }

// ALL

    @GetMapping("/count")
    public ResponseEntity<Long> countAllProjects() {

        long count = projectDetailsService.countAllProjects("false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/waiting")
    public ResponseEntity<Long> countWaitingProjects() {
        long count = projectDetailsService.countProjectsByStatus("Waiting for Business Case","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/procurement")
    public ResponseEntity<Long> countProcurementProjects() {
        long count = projectDetailsService.countProjectsByStatus("Procurement in Progress","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/implementation")
    public ResponseEntity<Long> countImplementationProjects() {
        long count = projectDetailsService.countProjectsByStatus("Implementation in Progress","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/completed")
    public ResponseEntity<Long> countCompletedProjects() {
        long count = projectDetailsService.countProjectsByStatus("Completed","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/hold")
    public ResponseEntity<Long> countHoldProjects() {
        long count = projectDetailsService.countProjectsByStatus("On Hold","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/count/cancelled")
    public ResponseEntity<Long> countCancelledProjects() {
        long count = projectDetailsService.countProjectsByStatus("Cancelled","false","unfulfilled");
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    // Project Manager

    @GetMapping("/owner/all/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatus(@PathVariable String projectManagerEmail) {

        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserName(projectManagerEmail, archived, completed);

        return projects;
    }

    @GetMapping("/owner/businessCase/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusBusinessCase(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Waiting for Business Case";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status,archived,completed);

        return projects;
    }

    @GetMapping("/owner/procurement/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusProcurement(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Procurement in Progress";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status, archived, completed);

        return projects;
    }

    @GetMapping("/owner/implementation/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusImplementation(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Implementation in Progress";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status, archived, completed);

        return projects;
    }

    @GetMapping("/owner/completed/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusCompleted(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Completed";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status, archived, completed);

        return projects;
    }

    @GetMapping("/owner/hold/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusHold(@PathVariable String projectManagerEmail) {
        // Define the statuses to include
        String status = "On Hold";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status, archived, completed);

        return projects;
    }

    @GetMapping("/owner/cancelled/{projectManagerEmail}")
    public Long countByOwner_UserNameAndStatusCancelled(@PathVariable String projectManagerEmail) {

        // Define the statuses to include
        String status = "Cancelled";
        String archived = "false";
        String completed = "unfulfilled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByOwner_UserNameAndStatus(projectManagerEmail, status, archived, completed);

        return projects;
    }

    // Technical Leader

    @GetMapping("/tech/all/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatus(@PathVariable String technicalLeaderEmail) {

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmail(technicalLeaderEmail);

        return projects;
    }

    @GetMapping("/tech/businessCase/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatusBusinessCase(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Waiting for Business Case";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/tech/procurement/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatusProcurement(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Procurement in Progress";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/tech/implementation/{technicalLeaderEmail}")
    public Long countByTechnicalNameAndStatusImplementation(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Implementation in Progress";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/tech/completed/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatusCompleted(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "Completed";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/tech/hold/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatusHold(@PathVariable String technicalLeaderEmail) {

        // Define the statuses to include
        String status = "On Hold";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }

    @GetMapping("/tech/cancelled/{technicalLeaderEmail}")
    public Long countByTechnicalAndStatusCancelled(@PathVariable String technicalLeaderEmail) {
        // Define the statuses to include
        String status = "Cancelled";

        // Retrieve projects owned by the current user
        Long projects = projectDetailsRepository.countByTechnicalLeaderEmailAndStatus(technicalLeaderEmail, status);

        return projects;
    }



    @GetMapping("/search")
    @ResponseBody
    public List<ADdetails> searchUsersByName(@RequestParam("fullName") String fullName) throws NamingException {
        List<ADdetails> user = aDdetailsService.searchAdUsersByName(fullName);

        return user;
    }


    @GetMapping("/technical")
    @ResponseBody
    public List<ADdetails> searchTechnicalLeader(@RequestParam("fullName") String fullName) throws NamingException {
        List<ADdetails> user = aDdetailsService.searchAdUsersByName(fullName);

        return user;
    }

    @GetMapping("/practitioner/{fullName}")
    @ResponseBody
    public List<ADdetails> searchPractitioner(@PathVariable String fullName) throws NamingException {
        List<ADdetails> user = aDdetailsService.searchAdUsersByName(fullName);

        return user;
    }

    @GetMapping("/supervisor")
    @ResponseBody
    public List<ADdetails> searchSupervisor(@RequestParam("fullName") String fullName) throws NamingException {
        List<ADdetails> user = aDdetailsService.searchAdUsersByName(fullName);

        return user;
    }

    @GetMapping("/viewADUsers")
    public List<ActAsAD> listADUsers(){
        return actAsAdService.listAll();
    }

}


