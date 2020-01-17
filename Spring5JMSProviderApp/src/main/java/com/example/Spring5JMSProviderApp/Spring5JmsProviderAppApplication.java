package com.example.Spring5JMSProviderApp;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.example.Spring5JMSProviderApp.config.AppConfig;

@SpringBootApplication
public class Spring5JmsProviderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JmsProviderAppApplication.class, args);
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(AppConfig.class);
		JmsTemplate jt=c.getBean(JmsTemplate.class);
		jt.send("my-test-spring",new MessageCreator() {
			
			@Override
			public Message createMessage(Session ses) throws JMSException {
				// TODO Auto-generated method stub
				return ses.createTextMessage("Sample One");
			}
		});
		c.close();
	}

}
