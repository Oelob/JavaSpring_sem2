package org.example.JavaSpring_sem2;

import org.example.JavaSpring_sem2.models.Panel;
import org.example.JavaSpring_sem2.models.TicketNumberGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaSpringSem2Application {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(JavaSpringSem2Application.class, args);
		TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
//		System.out.println(generator.createNewNumber());
//		System.out.println(generator.createNewNumber());
//		System.out.println(generator.createNewNumber());
		Panel newPanel = context.getBean(Panel.class);
		System.out.println(newPanel.newTicket());
		System.out.println(newPanel.newTicket());
		System.out.println(newPanel.newTicket());
	}

}
