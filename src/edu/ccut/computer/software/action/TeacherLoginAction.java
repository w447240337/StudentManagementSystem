package edu.ccut.computer.software.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.ccut.computer.software.model.TeacherLogin;
import edu.ccut.computer.software.service.TeacherLoginService;

public class TeacherLoginAction extends ActionSupport {
	private TeacherLoginService teacherloginService;
	private TeacherLogin teacherlogin;

	@Override
	public String execute() throws Exception {
		System.out.println(teacherlogin.getUsername());
		TeacherLogin user = teacherloginService
				.find(teacherlogin.getUsername(), teacherlogin.getPassword());
		if (user != null) {
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		} else
			return ERROR;
	}

	public TeacherLogin getTeacherLogin() {
		return teacherlogin;
	}

	public TeacherLoginService getTeacherLoginService() {
		return teacherloginService;
	}

	public void setTeacherLogin(TeacherLogin teacherlogin) {
		this.teacherlogin = teacherlogin;
	}

	public void setTeacherLoginService(TeacherLoginService teacherloginService) {
		this.teacherloginService = teacherloginService;
	}

}
