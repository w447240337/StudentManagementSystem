package edu.ccut.computer.software.model;


/**
 * @author duwenbo
 *
 */
public class Major implements java.io.Serializable {
	private Integer id;
	private String majorName;
	private Integer number;
	private String teacher;

	public Major() {
	}

	public Major(String majorName) {
		this.majorName = majorName;
	}

	public Major(String majorName, Integer number, String teacher) {
		this.majorName = majorName;
		this.number = number;
		this.teacher = teacher;
	}

	public Integer getId() {
		return id;
	}

	public String getMajorName() {
		return majorName;
	}

	public Integer getNumber() {
		return number;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}