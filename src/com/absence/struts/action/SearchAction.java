package com.absence.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.hibernate.beans.Application;
import com.absence.struts.dao.QingjiaDAO;
import com.absence.struts.forms.IdForm;
import com.absence.struts.forms.QingjiaForm;

public class SearchAction extends DispatchAction{
	

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		IdForm iform=(IdForm)form;
		String id=iform.getId();
		System.out.println("searchActgion----"+id);
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);	
		QingjiaDAO qingjia=new QingjiaDAO();
		ArrayList<Application> list=qingjia.search(id);
		session.setAttribute("xuehao", id);
		request.setAttribute("list", list);
	    forward=mapping.findForward("success");
		return(forward);
		
	}
}
