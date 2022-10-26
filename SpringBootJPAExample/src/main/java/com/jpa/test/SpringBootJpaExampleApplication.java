package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.Iterator;

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
  
    //1. Create User 
    
     /* User user1 = new User();
      user1.setStatus(".net dev");
      user1.setName("Rahul");
      user1.setCity("Patna");
      
      User user2 = new User();
      user2.setStatus("python dev");
      user2.setName("Amar");
      user2.setCity("Darbhanga");
      
    //  userRepository.save(user2); //Saves a Single entity but how about multiple saving ??
      List<User> users = List.of(user1,user2);
      Iterable<User> result= userRepository.saveAll(users);
      
       result.forEach(user->{
    	   System.out.println("Saved User "+ user);
       }); */
      
       
     //2. UpdateUser  
       
//    Optional<User> optional = userRepository.findById(10);
//    User user = optional.get();
//    System.out.print(user);
    
      // 3. Get the Data
    
      // findById(10); single data
       //Iterable<User> itr = userRepository.findAll();
//       Iterator<User> iterator = itr.iterator();
//       
//       while(iterator.hasNext()) {
//    	   
//    	   User user = iterator.next();
//    	   System.out.println(user);
//       }
       
       // or
       
//       itr.forEach(user->{
//    	   System.out.println(user);
//       });
       
       
       //4. Delete User
       
        // userRepository.deleteById(10);
    
//        Iterable<User> allUsers = userRepository.findAll();
//        
//        allUsers.forEach(user->System.out.println(user));
//        userRepository.deleteAll(allUsers);
        
	}
}
