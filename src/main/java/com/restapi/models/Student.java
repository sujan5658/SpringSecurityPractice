package com.restapi.models;

public class Student {
	private int rollNo;
	private String fullName;
	private String address;
	private String contactNo;
	private String faculity;
	private String level;
	private String program;
	private int batch;
	private String regNo;
	private boolean status;
	public Student() {
		this.rollNo = 0;
		this.fullName = "";
		this.address = "";
		this.contactNo = "";
		this.faculity = "";
		this.level = "";
		this.program = "";
		this.batch = 0;
		this.regNo = "";
		this.status = true;
	}
	
	public Student(int rollNo, String fullName, String address, String contactNo, String faculity, String level,
			String program, int batch, String regNo, boolean status) {
		this.rollNo = rollNo;
		this.fullName = fullName;
		this.address = address;
		this.contactNo = contactNo;
		this.faculity = faculity;
		this.level = level;
		this.program = program;
		this.batch = batch;
		this.regNo = regNo;
		this.status = status;
	}
	
	public Student(Student std) {
		this.rollNo = std.rollNo;
		this.fullName = std.fullName;
		this.address = std.address;
		this.contactNo = std.contactNo;
		this.faculity = std.faculity;
		this.level = std.level;
		this.program = std.program;
		this.batch = std.batch;
		this.regNo = std.regNo;
		this.status = std.status;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getFaculity() {
		return faculity;
	}

	public void setFaculity(String faculity) {
		this.faculity = faculity;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getBatch() {
		return batch;
	}

	public void setBatch(int batch) {
		this.batch = batch;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", fullName=" + fullName + ", address=" + address + ", contactNo="
				+ contactNo + ", faculity=" + faculity + ", level=" + level + ", program=" + program + ", batch="
				+ batch + ", regNo=" + regNo + ", status=" + status + "]";
	}
	
}
