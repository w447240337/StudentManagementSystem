package com.absence.hibernate.beans;

/**
 * Examine entity. @author MyEclipse Persistence Tools
 */

public class Examine implements java.io.Serializable {

	// Fields

	private Integer id;
	private Application application;
	private String examtime;
	private String permit;
	private String adminid;

	// Constructors

	/** default constructor */
	public Examine() {
	}

	/** minimal constructor */
	public Examine(Integer id, Application application) {
		this.id = id;
		this.application = application;
	}

	/** full constructor */
	public Examine(Integer id, Application application, String examtime,
			String permit, String adminid) {
		this.id = id;
		this.application = application;
		this.examtime = examtime;
		this.permit = permit;
		this.adminid = adminid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public String getExamtime() {
		return this.examtime;
	}

	public void setExamtime(String examtime) {
		this.examtime = examtime;
	}

	public String getPermit() {
		return this.permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}

	public String getAdminid() {
		return this.adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

}