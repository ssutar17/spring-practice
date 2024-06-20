package com.AutoWiring.Notation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("com/AutoWiring/Notation/autoWiringConfig.xml");
     Emp emp1=context.getBean("emp1", Emp.class);
     
     System.out.println(emp1);
	}

}
