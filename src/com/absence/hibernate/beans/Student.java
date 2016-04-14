package com.absence.hibernate.beans;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private String id;
	private Department department;
	private String name;
	private String password;
	private String class_;
	private String grade;
	private String phonenumber;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String id, String name, String password, String class_,
			String grade, String phonenumber) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.class_ = class_;
		this.grade = grade;
		this.phonenumber = phonenumber;
	}

	/** full constructor */
	public Student(String id, Department department, String name,
			String password, String class_, String grade, String phonenumber) {
		this.id = id;
		this.department = department;
		this.name = name;
		this.password = password;
		this.class_ = class_;
		this.grade = grade;
		this.phonenumber = phonenumber;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

}