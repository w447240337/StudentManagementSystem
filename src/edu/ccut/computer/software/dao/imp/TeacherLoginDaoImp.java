package edu.ccut.computer.software.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.ccut.computer.software.dao.TeacherLoginDao;
import edu.ccut.computer.software.model.TeacherLogin;

public class TeacherLoginDaoImp extends HibernateDaoSupport implements TeacherLoginDao {
	public boolean existUsername(String username) {
		List list = getHibernateTemplate().find("from TeacherLogin where username=?",
				username);
		if (list.size() > 0)
			return true;
		else
			return false;
	}

	public TeacherLogin find(String username, String password) {
		String str[] = { username, password };
		List list = getHibernateTemplate().find(
				"from TeacherLogin where username=? and password=?", str);
		if (list.size() > 0)
			return (TeacherLogin) list.get(0);
		else
			return null;
	}

	public void save(TeacherLogin user) {
		getHibernateTemplate().save(user);
	}
}
