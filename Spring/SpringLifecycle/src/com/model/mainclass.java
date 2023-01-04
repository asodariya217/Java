package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainclass {
public static void main(String[] args) 
{
	AbstractApplicationContext con = new ClassPathXmlApplicationContext("abc.xml");
	Person per = (Person) con.getBean("t1");
	System.out.println(per.getId()+":"+per.getName());
	con.registerShutdownHook();
}
}
