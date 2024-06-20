package com.constructorInjection;

public class Course {
    private String course;

	public Course(String course) {
		super();
		this.course = course;
	}

	@Override
	public String toString() {
		return "Course [course=" + course + "]";
	}
    
    
}
