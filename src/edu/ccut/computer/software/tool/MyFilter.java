package edu.ccut.computer.software.tool;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import edu.ccut.computer.software.model.Login;
import edu.ccut.computer.software.model.TeacherLogin;

public class MyFilter extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		Map session = arg0.getInvocationContext().getSession();
		System.out.println("3");
		Login user = (Login) session.get("user");
		TeacherLogin user1 = (TeacherLogin) session.get("user1");
		if (user == null) {
			System.out.println("4");
			return Action.LOGIN;
		}
		if (user1 == null) {
			return Action.LOGIN;
		}
		return arg0.invoke();
	}
}
