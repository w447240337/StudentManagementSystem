package com.absence.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.hibernate.beans.Application;
import com.absence.struts.dao.QingjiaDAO;
import com.absence.struts.forms.CheckForm;

public class ExamineAction extends DispatchAction{
	

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		CheckForm iform=(CheckForm)form;
	    int id=iform.getId();
	    String account=iform.getAccount();
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);	
		QingjiaDAO userDAO=new QingjiaDAO();
		Application user=userDAO.Update(id);
		session.setAttribute("account", account);
		request.setAttribute("user", user);
		forward=mapping.findForward("success");
		return(forward);
		
	}	
	
}
