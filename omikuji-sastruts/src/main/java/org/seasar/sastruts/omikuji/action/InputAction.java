package org.seasar.sastruts.omikuji.action;

import org.seasar.sastruts.omikuji.form.InputForm;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.Required;

public class InputAction {
	
	@Required
	@ActionForm
	protected InputForm inputform;

	@Execute(validator = true, validate = "validate", input = "index.jsp")
	public String output() {
		return "output.jsp";
	}
	
	@Execute(validator = false)
	public String index() {
		return "input.jsp";
	}
	
}
