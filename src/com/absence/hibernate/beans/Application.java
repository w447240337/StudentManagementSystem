package com.absence.hibernate.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Application entity. @author MyEclipse Persistence Tools
 */

public class Application implements java.io.Serializable {

	// Fields

	private Integer id;
	private Student student;
	private String name;
	private String teachclass;
	private String begintime;
	private String overtime;
	private String reason;
	private Set examines = new HashSet(0);

	// Constructors

	/** default constructor */
	public Application() {
	}

	/** minimal constructor */
	public Application(Student student, String teachclass) {
		this.student = student;
		this.teachclass = teachclass;
	}

	/** full constructor */
	public Application(Student student, String name, String teachclass, String begintime,
			String overtime, String reason, Set examines) {
		this.student = student;
		this.teachclass = teachclass;
		this.name = name;
		this.begintime = begintime;
		this.overtime = overtime;
		this.reason = reason;
		this.examines = examines;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getTeachclass() {
		return this.teachclass;
	}

	public void setTeachclass(String teachclass) {
		this.teachclass = teachclass;
	}

	public String getBegintime() {
		return this.begintime;
	}
	
	public String getName() {
		return this.name;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	public String getOvertime() {
		return this.overtime;
	}

	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Set getExamines() {
		return this.examines;
	}

	public void setExamines(Set examines) {
		this.examines = examines;
	}

	public void setName(String name) {
		this.name = name;
	}

}