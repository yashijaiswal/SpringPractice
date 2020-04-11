package com.test.springprac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.springprac.beans.Address;
import com.test.springprac.beans.Department;
import com.test.springprac.beans.Employee;

public class App {

  public static void main(String[] args) {
    
	  @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringTest.xml");
	  
	/*
	 * 
	 * System.out.println(adr.toString());
	 * 
	 * Department dept = context.getBean("department", Department.class);
	 * System.out.println(dept.toString());
	 */ 
	  
	  Address adr = context.getBean("adr", Address.class);
	  adr.setCity("Greater Noida");
	  adr.setCountry("India");
	  adr.setState("UP");
	  adr.setStreet("Char Murti");
	  
	  Address adr1 = context.getBean("adr", Address.class);
	  adr1.setCity("Noida");
	  adr1.setCountry("India");
	  adr1.setState("UP");
	  adr1.setStreet("Ek Murti");
	  
	  Department dep = context.getBean("department", Department.class);
	  dep.setDeptAddr(adr1);
	  
	  Employee emp = context.getBean("employee", Employee.class);
	  emp.setAddr(adr);
	  System.out.println(emp.toString());
	  
	  ((AbstractApplicationContext) context).registerShutdownHook();
	  
	 
  }

}
