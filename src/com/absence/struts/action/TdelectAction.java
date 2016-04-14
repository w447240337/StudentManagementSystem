package com.absence.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.struts.dao.TeacherDAO;
import com.absence.struts.dao.UserDAO;
import com.absence.struts.forms.CheckForm;

public class TdelectAction extends DispatchAction{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		CheckForm iform=(CheckForm)form;
	    int id=iform.getId();
	    String account=iform.getAccount();
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);
		TeacherDAO dao=new TeacherDAO();
		UserDAO userDAO=new UserDAO();
		dao.Delect(id);
		String name=userDAO.isName_T(account);
		session.setAttribute("name",name);
		session.setAttribute("id",account);
		forward=mapping.findForward("success");
		return(forward);
		
	}
	
}
