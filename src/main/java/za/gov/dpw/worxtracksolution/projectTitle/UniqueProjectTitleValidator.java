package za.gov.dpw.worxtracksolution.projectTitle;

import za.gov.dpw.worxtracksolution.entity.ProjectDetails;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class UniqueProjectTitleValidator implements ConstraintValidator<UniqueProjectTitle, ProjectDetails> {

    @Override
    public void initialize(UniqueProjectTitle constraintAnnotation) {
    }

    @Override
    public boolean isValid(ProjectDetails projectDetails, ConstraintValidatorContext context) {
        // Validate uniqueness logic here

        // Implement your logic to check uniqueness based on the year from startDate to endDate
        if (!isProjectTitleUniqueForYearRange(projectDetails)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Project title must be unique within the specified year range.")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }

    private boolean isProjectTitleUniqueForYearRange(ProjectDetails projectDetails) {
        // Implement your logic to check uniqueness based on the year from startDate to endDate
        // Example pseudo-code:
        LocalDate startDate = LocalDate.parse(projectDetails.getStartDate());
        LocalDate endDate = LocalDate.parse(projectDetails.getEndDate());
        String projectTitle = projectDetails.getProjectTitle();

        // Check if projectTitle is unique for the specified year range
        // Example pseudo-code:
        // if (isNotUniqueForYearRange(startDate, endDate, projectTitle)) {
        //     return false;
        // }

        return true; // If unique
    }
}


