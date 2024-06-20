package com.injectReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
         ApplicationContext context= new ClassPathXmlApplicationContext("com/injectReferenceType/refConfig.xml");
         A temp=(A) context.getBean("a1");
         
         System.out.println(temp.getOb());
         System.out.println(temp);
	}

}
