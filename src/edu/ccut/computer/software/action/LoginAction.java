package edu.ccut.computer.software.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.ccut.computer.software.model.Login;
import edu.ccut.computer.software.service.LoginService;

public class LoginAction extends ActionSupport {
	private LoginService loginService;
	private Login login;

	@Override
	public String execute() throws Exception {
		System.out.println(login.getUsername());
		Login user = loginService
				.find(login.getUsername(), login.getPassword());
		if (user != null) {
			Map session = ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		} else
			return ERROR;
	}

	public Login getLogin() {
		return login;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
