package edu.ccut.computer.software.dao;

import edu.ccut.computer.software.model.TeacherLogin;


/**
 * @author duwenbo
 *
 */
public interface TeacherLoginDao {
	// �Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existUsername(String username);

	// ����ѧ�źͿ������
	public TeacherLogin find(String username, String password);

	// �����û�
	public void save(TeacherLogin user);
}
