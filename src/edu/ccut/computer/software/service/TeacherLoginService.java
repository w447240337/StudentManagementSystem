package edu.ccut.computer.software.service;

import edu.ccut.computer.software.model.TeacherLogin;

public interface TeacherLoginService {
	// �Ƿ���ڸ�ѧ�ŵ��û�
	public boolean existUsername(String username);

	// ����ѧ�źͿ������
	public TeacherLogin find(String username, String password);

	// �����û�
	public void save(TeacherLogin user);
}
