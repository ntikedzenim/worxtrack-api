package za.gov.dpw.worxtracksolution.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import za.gov.dpw.worxtracksolution.service.ProgressNotificationService;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Entity
public class ProjectDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String projectTitle;
    private String projectDescription;
    private String estimatedValue;
    private String startDate;
    private String endDate;
    private String status;
    private String projectManager;
    private String projectManagerEmail;
    private String technicalLeader;
    private String technicalLeaderEmail;
    private String unit;
    private String otherUnit;
    private String projectCategory;
    private String inHouse;
    private String outSourced;
    private String comments;
    private String dateCreated;
    private String ptsRef;
    private String archived;
    private String completed;
    private String reason;



    public ProjectDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getProjectManagerEmail() {
        return projectManagerEmail;
    }

    public void setProjectManagerEmail(String projectManagerEmail) {
        this.projectManagerEmail = projectManagerEmail;
    }

    public String getTechnicalLeader() {
        return technicalLeader;
    }

    public void setTechnicalLeader(String technicalLeader) {
        this.technicalLeader = technicalLeader;
    }

    public String getTechnicalLeaderEmail() {
        return technicalLeaderEmail;
    }

    public void setTechnicalLeaderEmail(String technicalLeaderEmail) {
        this.technicalLeaderEmail = technicalLeaderEmail;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getProjectCategory() {
        return projectCategory;
    }

    public void setProjectCategory(String projectCategory) {
        this.projectCategory = projectCategory;
    }

    public String getInHouse() {
        return inHouse;
    }

    public void setInHouse(String inHouse) {
        this.inHouse = inHouse;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    @PrePersist
    public void setDateCreated() {
        this.dateCreated = LocalDate.now().toString(); // Use LocalDate or LocalDateTime depending on your requirements
    }

//    public long getDaysSinceCreation() {
//        LocalDate startDate = LocalDate.parse(dateCreated);
//        LocalDate endDate = LocalDate.now();
//        return ChronoUnit.DAYS.between(startDate, endDate);
//    }

    public String getPtsRef() {
        return ptsRef;
    }

    public void setPtsRef(String ptsRef) {
        this.ptsRef = ptsRef;
    }

    public String getOtherUnit() {
        return otherUnit;
    }

    public void setOtherUnit(String otherUnit) {
        this.otherUnit = otherUnit;
    }

    public String getOutSourced() {
        return outSourced;
    }

    public void setOutSourced(String outSourced) {
        this.outSourced = outSourced;
    }

    public String getArchived() {
        return archived;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    //    public long getDaysBetweenStartAndEnd() {
//        LocalDate startDate = LocalDate.parse(this.startDate);
//        LocalDate endDate = LocalDate.parse(this.endDate);
//        return ChronoUnit.DAYS.between(startDate, endDate);
//    }
}
