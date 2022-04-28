package org.seasar.sastruts.omikuji.form;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;
import org.seasar.sastruts.omikuji.classes.Checkbirthday;
import org.seasar.struts.annotation.Required;

@Component(instance = InstanceType.SESSION)
public class InputForm implements Serializable{
	
	@SuppressWarnings("unused")
	private static final long serialVerisionUID = 1L;
	
	@Required
	public String birthday;
	
	@Resource
	protected HttpServletRequest request;

	public ActionMessages validate() {
		ActionMessages errors = new ActionMessages();
		Boolean checkbday = Checkbirthday.checkbday(birthday);
		
		if(checkbday.equals(false)) {
			errors.add("", new ActionMessage("errmsg.num", "Error! "));
		}
		
		return errors;
	}
}
