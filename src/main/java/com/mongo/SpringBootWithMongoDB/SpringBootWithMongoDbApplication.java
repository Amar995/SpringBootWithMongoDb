package com.mongo.SpringBootWithMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongo.Model.Student;
import com.mongo.dao.StudentDaoI;
import com.mongo.service.StudentService;

@SpringBootApplication
@ComponentScan(basePackages = "com.mongo")
@EnableMongoRepositories(basePackages = "com.mongo.dao")
public class SpringBootWithMongoDbApplication {
	

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMongoDbApplication.class, args);
	}

}
