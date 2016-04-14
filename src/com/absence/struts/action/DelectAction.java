package com.absence.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.struts.dao.QingjiaDAO;
import com.absence.struts.dao.UserDAO;
import com.absence.struts.forms.AidForm;

public class DelectAction extends DispatchAction{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		AidForm iform=(AidForm)form;
	    int id=iform.getId();
	    String xuehao=iform.getXuehao();
	    System.out.println(xuehao);
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);
		QingjiaDAO qingjia=new QingjiaDAO();
		UserDAO userDAO=new UserDAO();
		qingjia.Delect(id);
		String name=userDAO.isName_S(xuehao);
		session.setAttribute("name",name);
		session.setAttribute("id",xuehao);
		forward=mapping.findForward("success");
		return(forward);
		
	}
	
}
