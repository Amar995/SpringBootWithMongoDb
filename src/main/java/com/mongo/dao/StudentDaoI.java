package com.mongo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mongo.Model.Student;
@Repository
public interface StudentDaoI extends MongoRepository<Student, String>{

	Student findByNameAndAge(String name,int age);
	@Query("{ name : { $regex  : ?0}}")
	public List<Student>  getMbl(String mbl);
	@Query("{ name : { $regex  : /^am/}}")
	public List<Student>  getName();
	
	}
