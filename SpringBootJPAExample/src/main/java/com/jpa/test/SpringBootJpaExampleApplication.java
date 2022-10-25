package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		
    UserRepository userRepository = context.getBean(UserRepository.class);	
    
    User user = new User();
    
    user.setName("vikash kumar");
    user.setCity("patna");
    user.setStatus("DevOps Engineer");
    
    User user1 = userRepository.save(user);
    
    System.out.print(user1);
	}

}
