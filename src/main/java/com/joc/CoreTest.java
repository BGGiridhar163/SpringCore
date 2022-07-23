package com.joc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CoreTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		 //ApplicationContext ctx1 = new FileSystemXmlApplicationContext();
		
		Employee e= (Employee) ctx.getBean("emp");
		System.out.println("Employee Id : "+e.getEid()+" Employee Name : "+e.getEname()+" Salary : "+e.getSalary());
		
		 Address a =(Address) ctx.getBean("add");
		 System.out.println(a.toString());
		 a.display();
		 
		 ListEx li =(ListEx)ctx.getBean("l1");
		 li.display();
	}

}
