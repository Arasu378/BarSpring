package com.kyrostechnologies.bar.bar.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
@Service
public class EmailServiceImpl  {
    @Autowired
    private JavaMailSender sender;

    private void sendEmail(String emailId,String message,String subject)throws Exception{
        MimeMessage mimeMessage=sender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);
        helper.setTo(emailId);
        helper.setText(message);
        helper.setSubject(subject);
        sender.send(mimeMessage);

    }
}
