package com.absence.struts.forms;

import org.apache.struts.action.ActionForm;

public class UpdateForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id=0;
	String teachclass=null;
	String xuehao=null;
	String begintime=null;
	String overtime=null;
	String reason=null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeachclass() {
		return teachclass;
	}
	public void setTeachclass(String teachclass) {
		this.teachclass = teachclass;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String getBegintime() {
		return begintime;
	}
	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
    
}
