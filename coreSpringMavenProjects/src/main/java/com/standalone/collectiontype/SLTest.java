package com.standalone.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.firstMavenSpringProject.Student;

public class SLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("com/standalone/collectiontype/SLconfig.xml");
        
        Stud student1= (Stud) context.getBean("student1", "com.standalone.collectiontype.Student.class");
        
        System.out.println(student1);
	}

}
