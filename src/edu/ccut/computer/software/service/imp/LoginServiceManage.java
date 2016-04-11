package edu.ccut.computer.software.service.imp;

import edu.ccut.computer.software.dao.LoginDao;
import edu.ccut.computer.software.model.Login;
import edu.ccut.computer.software.service.LoginService;

public class LoginServiceManage implements LoginService {
	// 对loginDao进行依赖注入
	private LoginDao loginDao;

	public boolean existUsername(String username) {
		return loginDao.existUsername(username);
	}

	public Login find(String username, String password) {
		System.out.println("1");
		return loginDao.find(username, password);
	}

	public void save(Login user) {
		loginDao.save(user);
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
}
