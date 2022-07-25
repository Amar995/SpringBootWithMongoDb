package com.mongo.Model;

public class Subject {
private String sub;
private int subid;
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public int getSubId() {
	return subid;
}
public void setSubId(int subid) {
	this.subid = subid;
}
@Override
public String toString() {
	return "Subject [sub=" + sub + ", subid=" + subid + "]";
}
}
