package com.springjdbc.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain { 
	public static void main(String args[]) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
//		StudentDaoImpl dao = ctx.getBean("stddao",StudentDaoImpl.class); 
//		
//		Student st = new Student("Rahul",100,850);
//		int rows = dao.addStudent(st);
//		if(rows>0)
//			System.out.println(rows+" inserted");
//		
		//get the list of all employees.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springjdbc.xml");
		StudentDaoImpl dao = ctx.getBean("stddao",StudentDaoImpl.class); 
		
		List<Student> stdlist = dao.getallStudents();
		for(Student referenceobj:stdlist)
			System.out.println(referenceobj.getStdname()+" "+referenceobj.getStdno()+" "+referenceobj.getStdmarks());
		
	}

}
