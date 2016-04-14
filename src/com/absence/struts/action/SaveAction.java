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
import com.absence.struts.dao.QingjiaDAO;
import com.absence.struts.dao.UserDAO;
import com.absence.struts.forms.IdForm;
import com.absence.struts.forms.QingjiaForm;
import com.absence.struts.forms.UpdateForm;

public class SaveAction extends DispatchAction{
	

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception{
		ActionForward forward=new ActionForward();
		UpdateForm iform=(UpdateForm)form;
		HttpSession session=request.getSession(false);
		if(session!=null){session.invalidate();}
		session=request.getSession(true);	
		String xuehao=iform.getXuehao();
		System.out.println(xuehao);
		UserDAO userDAO=new UserDAO();
		QingjiaDAO qingjia=new QingjiaDAO();
		boolean isSave=qingjia.Save(iform.getId(),iform.getTeachclass(),iform.getBegintime(),iform.getOvertime(),iform.getReason());
		if(isSave){
			String name=userDAO.isName_S(xuehao);
			session.setAttribute("id",xuehao);
			session.setAttribute("name",name);
			forward=mapping.findForward("success");
		}
		return(forward);
		
	}	
	
}
