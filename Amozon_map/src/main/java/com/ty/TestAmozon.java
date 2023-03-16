package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmozon {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person) context.getBean("myper");
		System.out.println("person dtails");
		System.out.println("---------------");
		System.out.println(person);
		System.out.println("\n\nperson has mobil and its details");
		System.out.println("---------------------------------");

		System.out.println(person.getMobil());
		System.out.println("\n\norder items from amozon from a person mobil");
		System.out.println("-------------------------------------------");

		System.out.println(person.getMobil().getAmozon());

	}
}
