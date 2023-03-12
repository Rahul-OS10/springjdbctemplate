package com.springjdbc.demo;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl { 
	
	private JdbcTemplate jdbctemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbctemplate = jdbcTemplate;
	} 
	public int addStudent(Student std)
	{
		String sql = "insert into Student values(?,?,?)";
		return jdbctemplate.update(sql, new Object[] {std.getStdname() , std.getStdno() , std.getStdmarks()});
	}
	
	public List<Student> getallStudents()
	{
		String sql = "select * from Student";
		List<Student> stdlist = jdbctemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class)); 
		
		return stdlist;
		
	}

}
