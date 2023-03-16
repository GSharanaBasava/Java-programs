package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyperson {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person) context.getBean("Myperson");
		Person person1=(Person) context.getBean("Myperson1");
		Person person2=(Person) context.getBean("Myperson2");
		
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person2);
	}

}
