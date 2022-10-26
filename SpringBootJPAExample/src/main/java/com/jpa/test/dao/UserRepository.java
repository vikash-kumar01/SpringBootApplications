package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	
	//Custom Finder Methods
	
	public List<User> findByName(String name); //MeaningFull Custom Name should be given so SprngBoot can Identify
	
	public List<User>findByNameAndCity(String name, String city);
	
	// Executing JPQL and Native Queries
	
	@Query("select u from User u")
	public List<User> getAllUser(); 
	
	
	// Executing Query Param
	@Query("select u FROM User u WHERE u.name= :n")
	public List<User> getUserByName(@Param("n") String name);  // Input binding n with name
	
	@Query("select u FROM User u WHERE u.name= :n and u.city= :c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);  // Input binding n with name
	
	@Query(value = "select * FROM User" , nativeQuery= true)
	public List<User> getUsers();
}


//Interface extends CrudRepository<>