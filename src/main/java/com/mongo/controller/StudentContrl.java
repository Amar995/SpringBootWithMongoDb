package com.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.Model.Student;
import com.mongo.dao.StudentDaoI;
import com.mongo.service.StudentService;

@RestController
public class StudentContrl {
	@Autowired
	StudentService ser;
	@Autowired
	StudentDaoI ik;

	@PostMapping("/save")
	public void save(@RequestBody Student st)
	{
		ser.main(st);
	}
	@GetMapping("/get")
	public List<Student> get()
	{
		return ik.findAll();
	
	}
	@PostMapping("/update")
	public Student update(@RequestBody Student s)
	{
		return ik.save(s);
	
	}
	@GetMapping("/field/{name}/{age}")
	public Student update(@PathVariable String name,@PathVariable int age)
	{
		return ik.findByNameAndAge(name, age);
	
	}
	@GetMapping("/getPage")
	public List<Student> pagg(@RequestParam int  pagNo,@RequestParam int pageSize)
	{
		Pageable p=PageRequest.of(pagNo, pageSize);
				//,Sort.by("age").descending());
		return ik.findAll(p).getContent();
		
	}
	@GetMapping("/sort")
	public List<Student> sort()
	{
		 Sort se=Sort.by(Sort.DEFAULT_DIRECTION.DESC, "age");
		return ik.findAll(se);
		
	}
	@GetMapping("/like")
	public List<Student> isLike(@RequestParam String mbl)
	{
		 return ik.getMbl(mbl);
	}
	@GetMapping("/query")
	public List<Student> isNmae()
	{
		 return ik.getName();
	}
}
