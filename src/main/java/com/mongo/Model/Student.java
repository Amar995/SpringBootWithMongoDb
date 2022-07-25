package com.mongo.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("student_docu")
public class Student {
    @Id
	private String id;
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", mblno=" + mblno + "]";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMblno() {
		return mblno;
	}
	public void setMblno(long mblno) {
		this.mblno = mblno;
	}
	private String name;
	private int age;
	private long mblno;
	private Adress ad;
	private List<Subject> list;
	public Adress getAd() {
		return ad;
	}
	public void setAd(Adress ad) {
		this.ad = ad;
	}
	public List<Subject> getList() {
		return list;
	}
	public void setList(List<Subject> list) {
		this.list = list;
	}
		
}
