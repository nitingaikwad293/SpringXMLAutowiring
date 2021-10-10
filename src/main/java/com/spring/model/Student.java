package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private Integer studentId;
	private String studentName;
	private Address address;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getStudentDetails() {
		StringBuffer details = new StringBuffer();
		details.append(" Id : ");
		details.append(studentId);
		details.append(" Name : ");
		details.append(studentName);
		details.append(" City : ");
		details.append(address.getCity());
		return details.toString();
	}
	
	
	

}
