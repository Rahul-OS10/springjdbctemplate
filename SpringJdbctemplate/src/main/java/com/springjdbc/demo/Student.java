package com.springjdbc.demo;

public class Student {
	
	private String stdname;
	private int stdno;
	private float stdmarks;
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdno() {
		return stdno;
	}
	public void setStdno(int stdno) {
		this.stdno = stdno;
	}
	public float getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(float stdmarks) {
		this.stdmarks = stdmarks;
	}
	
	public Student(String stdname, int stdno, float stdmarks) {
		super();
		this.stdname = stdname;
		this.stdno = stdno;
		this.stdmarks = stdmarks;
	}
	@Override
	public String toString() {
		return "Student [stdname=" + stdname + ", stdno=" + stdno + ", stdmarks=" + stdmarks + "]";
	}
	
	
	

}
