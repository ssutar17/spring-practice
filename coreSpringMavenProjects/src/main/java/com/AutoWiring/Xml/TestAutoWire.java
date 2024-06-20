package com.AutoWiring.Xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("com/AutoWiring/Xml/autoWiringConfig.xml");
     Emp emp1=context.getBean("emp1", Emp.class);
     
     System.out.println(emp1);
	}

}
