package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import original.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("person.xml");
		Person person = applicationContext.getBean("person", Person.class);
		person.walk();
		
	}
}
