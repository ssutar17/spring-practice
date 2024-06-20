package com.standalone.collectiontype;

import java.util.*;

public class Stud {
	private String name;
	private int roll;
	//private Teacher teacher;
	private LinkedHashSet phNo;
	private List<String> subjects;
	private Map<String, String> courses;

	
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stud(String name, int roll, LinkedHashSet phNo, List<String> subjects, Map<String, String> courses) {
	
		this.name = name;
		this.roll = roll;
		this.phNo = phNo;
		this.subjects = subjects;
		this.courses = courses;
		//this.teacher=teacher;
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ",\n roll=" + roll + ",\n phNo=" + phNo + ",\n subjects="
				+ subjects + ",\n courses=" + courses + "]";
	}


}
