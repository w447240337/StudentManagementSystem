package edu.ccut.computer.software.model;



/**
 * @author duwenbo
 *
 */
public class TeacherLogin implements java.io.Serializable {
	private Integer id;
	private String username;
	private String password;

	public TeacherLogin() {
	}

	public TeacherLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		System.out.println("1");
		return username;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}