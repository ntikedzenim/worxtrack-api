package za.gov.dpw.worxtracksolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class ProgressNotificationService {

    @Autowired
    private SendMailService sendMailService;

    public void sendProgressNotification(String toAddress, String projectTitle, double progress) {
        if (progress >= 0.2) {
            sendMailService.sendEmail(toAddress, "Project Progress Update",
                    "Project '" + projectTitle + "' reached 20% progress.");
        }
        if (progress >= 0.5) {
            sendMailService.sendEmail(toAddress, "Project Progress Update",
                    "Project '" + projectTitle + "' reached 50% progress.");
        }
        if (progress >= 0.8) {
            sendMailService.sendEmail(toAddress, "Project Progress Update",
                    "Project '" + projectTitle + "' reached 80% progress.");
        }
    }

    public void sendProgressNotifications(String toAddress, String projectTitle, String projectManagerEmail, String startDate, String endDate) {
        double progress = getProgress(startDate, endDate);
        sendProgressNotification(toAddress, projectTitle, progress);
    }


    public double getProgress(String startDate, String endDate) {
        LocalDate currentDate = LocalDate.now();
        LocalDate projectStartDate = LocalDate.parse(startDate);
        LocalDate projectEndDate = LocalDate.parse(endDate);

        long totalDays = ChronoUnit.DAYS.between(projectStartDate, projectEndDate);
        long daysElapsed = ChronoUnit.DAYS.between(projectStartDate, currentDate);

        double progress = (double) daysElapsed / totalDays;
        return progress;
    }


}