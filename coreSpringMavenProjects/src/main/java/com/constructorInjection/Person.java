package com.constructorInjection;

import java.util.List;

public class Person {
   private String name;
   private int personId;
   private Course crs;
   private List<String> list;
   
public Person(String name, int personId, Course crs, List<String> list) {
	super();
	this.name = name;
	this.personId = personId;
	this.crs = crs;
	this.list = list;
}

@Override
public String toString() {
	return "Person [name=" + name + ", personId=" + personId + ", crs=" + crs + ", list=" + list + "]";
}
   
   
}
