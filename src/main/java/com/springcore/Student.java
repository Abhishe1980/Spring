package com.springcore;

public class Student {
  
	private int studentdId;
	private String studentName;
	private String studentAddress;
	public int getStudentdId() {
		return studentdId;
	}
	public void setStudentdId(int studentdId) {
		System.out.println("Setting Student ID");
		this.studentdId = studentdId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}
	public Student(int studentdId, String studentName, String studentAddress) {
		super();
		this.studentdId = studentdId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentdId=" + studentdId + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	}