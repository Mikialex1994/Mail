package com.example.mailspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSpringApplication {

    @Autowired
    private EmailSenderService senderService;

    public static void main(String[] args) {

        SpringApplication.run(MailSpringApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
	public void  sendMail(){

		senderService.sendEmail("viciy56808@gam1fy.com","This Is tHE suBjECt","THIS IS THE BODy");


	}

}
