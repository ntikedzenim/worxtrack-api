package za.gov.dpw.worxtracksolution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Component
public class SendMailService {

    @Autowired
    private JavaMailSender sender;

    @Autowired
    public SendMailService(JavaMailSender sender) {
        this.sender = sender;
    }

    public void sendEmail(String toAddress, String subject, String body) {

        MimeMessage msg = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg);

        try {
            helper.setFrom(new InternetAddress("No-Reply@dpw.gov.za"));
            helper.setTo(toAddress);
            helper.setSubject(subject);
            helper.setText(body);
        } catch (Exception e) {
        }
        sender.send(msg);
    }
}
