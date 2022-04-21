package org.seasar.sastruts.omikuji.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.seasar.sastruts.omikuji.condition.Checkbirthday;

public class InputForm {
	public String birthday;
	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public ActionErrors validate() {
		ActionErrors errors = new ActionErrors();
		Boolean checkbday = Checkbirthday.checkbday(birthday);
		
		if(checkbday.equals(false)) {
			errors.add("", new ActionMessage("errmsg.num", "Error! "));
		}
		
		return errors;
	}
}
