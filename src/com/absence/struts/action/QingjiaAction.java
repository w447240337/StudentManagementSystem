package com.absence.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.struts.dao.UserDAO;
import com.absence.struts.forms.QingjiaForm;

public class QingjiaAction extends DispatchAction{
   public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response){
	  
	   ActionForward forward=new ActionForward();
	   QingjiaForm qingjiaForm =(QingjiaForm)form;
	   HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);	
	   String id=qingjiaForm.getXuehao();
	   System.out.println(id);
	   System.out.println(qingjiaForm.getXuehao()+"-"+qingjiaForm.getTeachclass());
	   UserDAO userDAO=new UserDAO();
	  boolean isInsert=userDAO.add(qingjiaForm.getXuehao(),qingjiaForm.getTeachclass(),qingjiaForm.getBegintime(),qingjiaForm.getOvertime(),qingjiaForm.getReason());
	  if(!isInsert){	 
		  forward=mapping.findForward("failure");
	  }else{
		  String name=userDAO.isName_S(id);
		  session.setAttribute("id",id);
		  session.setAttribute("name",name);
		  forward=mapping.findForward("success");
	  }
	  return(forward);
	 
   }
}
   
