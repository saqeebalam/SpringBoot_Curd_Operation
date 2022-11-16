package com.marketing.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;//this are come from mail jar file which is add in pom.xml file dependency
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component //by adding this annotation i am converting normal class to spring class
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender mailSender;//it is mendatory to use to send email
	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);//here we add email
		mailMessage.setSubject(subject);//here we add subject
		mailMessage.setText(message);//here we add message
		mailSender.send(mailMessage);//this is to for send mail likes send buttin
	}
	

}
