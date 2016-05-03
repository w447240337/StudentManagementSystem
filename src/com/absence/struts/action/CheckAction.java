package com.absence.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.absence.hibernate.beans.Examine;

import com.absence.struts.dao.TeacherDAO;
import com.absence.struts.forms.IdForm;

public class CheckAction extends DispatchAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		IdForm iform = (IdForm) form;
		String account = iform.getId();
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		session = request.getSession(true);
		TeacherDAO userDAO = new TeacherDAO();
		ArrayList<Examine> list = userDAO.Check_E();
		session.setAttribute("account", account);
		request.setAttribute("list", list);
		forward = mapping.findForward("success");
		return (forward);

	}
}
