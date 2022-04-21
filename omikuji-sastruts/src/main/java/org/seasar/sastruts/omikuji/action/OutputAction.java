package org.seasar.sastruts.omikuji.action;

import org.seasar.sastruts.omikuji.form.OutputForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class OutputAction {
	
	@Required
	@ActionForm
	protected OutputForm outputform;
	
	private static final String path = "/omikuji-sastruts/csvomkj.csv";
	
	@Execute(validator = false)
	public String output() {
		
		
		
		return "output.jsp";
	}
	

}
