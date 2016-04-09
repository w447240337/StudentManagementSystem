package edu.ccut.computer.software.dao;

import edu.ccut.computer.software.model.TeacherLogin;


/**
 * @author duwenbo
 *
 */
public interface TeacherLoginDao {
	// 是否存在该学号的用户
	public boolean existUsername(String username);

	// 根据学号和口令查找
	public TeacherLogin find(String username, String password);

	// 插入用户
	public void save(TeacherLogin user);
}
