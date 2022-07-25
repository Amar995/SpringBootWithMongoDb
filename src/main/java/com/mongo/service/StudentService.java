package com.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.Model.Student;
import com.mongo.dao.StudentDaoI;
@Service
public class StudentService {

    @Autowired
	StudentDaoI st;
	
	public  void main(Student s) {
		
//		Student s=new Student();
//		s.setAge(10);
//		s.setMblno(9898989L);
//		s.setName("amar");
        st.save(s);
	}
}
