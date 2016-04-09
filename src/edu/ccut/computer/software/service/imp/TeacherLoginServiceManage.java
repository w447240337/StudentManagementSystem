package edu.ccut.computer.software.service.imp;

import edu.ccut.computer.software.dao.TeacherLoginDao;
import edu.ccut.computer.software.model.TeacherLogin;
import edu.ccut.computer.software.service.TeacherLoginService;

public class TeacherLoginServiceManage implements TeacherLoginService {
	// 对teacherloginDao进行依赖注入
	private TeacherLoginDao teacherloginDao;

	public boolean existUsername(String username) {
		return teacherloginDao.existUsername(username);
	}

	public TeacherLogin find(String username, String password) {
		return teacherloginDao.find(username, password);
	}

	public void save(TeacherLogin user) {
		teacherloginDao.save(user);
	}

	public void setTeacherLoginDao(TeacherLoginDao teacherloginDao) {
		this.teacherloginDao = teacherloginDao;
	}
}
