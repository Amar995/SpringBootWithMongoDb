package com.mongo.Model;

public class Adress {

	private String dist;
	@Override
	public String toString() {
		return "Adress [dist=" + dist + ", at=" + at + "]";
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getAt() {
		return at;
	}
	public void setAt(String at) {
		this.at = at;
	}
	private String at;
}
