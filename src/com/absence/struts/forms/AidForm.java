package com.absence.struts.forms;

import org.apache.struts.action.ActionForm;

public class AidForm extends ActionForm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id=0;
    String xuehao=null;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
}
