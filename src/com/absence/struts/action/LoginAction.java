package com.absence.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.hibernate.beans.Student;
import com.absence.hibernate.beans.Teacher;
import com.absence.struts.dao.UserDAO;
import com.absence.struts.forms.LoginForm;

public class LoginAction extends DispatchAction{
	

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		LoginForm loginForm=(LoginForm)form;
	    String id=loginForm.getId();
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);	
		int isValid=valid(loginForm);
		UserDAO userDAO=new UserDAO();
		if(isValid==1){
			String name=userDAO.isName_T(id);
			session.setAttribute("id",id);
			session.setAttribute("name",name);
			forward=mapping.findForward("success");
		}else if(isValid==2){
			String name=userDAO.isName_S(id);
			session.setAttribute("id",id);
			session.setAttribute("name",name);
			forward=mapping.findForward("ok");
		}
		else{
			forward=mapping.findForward("failure");
		}
		return(forward);
		
	}
	private int valid(LoginForm loginForm){
		    UserDAO userDAO=new UserDAO();
		    System.out.println(loginForm.getId()+ "/////" +loginForm.getPassword());
		    String shenfen=loginForm.getShenfen();
		    System.out.println(shenfen);
		    if(shenfen.equals("teacher")){
		    	Teacher user=userDAO.valid_T(loginForm.getId(),loginForm.getPassword());
		        if(user!=null){
		        	return 1;
		    	}
		        else{
		        	return 0;
		    	}
		    }
		    else{
		    	Student user=userDAO.valid_S(loginForm.getId(),loginForm.getPassword());
		        if(user!=null){
		        	return 2;
		    	}
		        else{
		        	return 0;
		    	}
		    }
	}
		
		
			
			
		
	
}
