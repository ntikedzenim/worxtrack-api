package za.gov.dpw.worxtracksolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WorxTrackSolutionApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorxTrackSolutionApplication.class, args);
    }
}


//@SpringBootApplication
//@RestController
//public class WorxTrackSolutionApplication extends SpringBootServletInitializer {
//
//    public WorxTrackSolutionApplication() {
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(WorxTrackSolutionApplication.class, args);
//
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(WorxTrackSolutionApplication.class);
//    }
//
//    // This request mapping will handle all URLs and serve the Angular app
//    @RequestMapping({"/", "/{path:[^\\.]*}"})
//    public String forward() {
//        return "Hello world";
//    }
//}