package za.gov.dpw.worxtracksolution.projectTitle;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueProjectTitleValidator.class)
@Documented
public @interface UniqueProjectTitle {
    String message() default "Project title must be unique within the specified year range.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


