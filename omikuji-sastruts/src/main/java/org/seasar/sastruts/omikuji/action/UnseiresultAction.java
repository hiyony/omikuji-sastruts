package org.seasar.sastruts.omikuji.action;



import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import org.seasar.sastruts.omikuji.entity.Unseiresult;
import org.seasar.sastruts.omikuji.service.UnseiresultService;
import org.seasar.sastruts.omikuji.form.UnseiresultForm;

public class UnseiresultAction {


    public List<Unseiresult> unseiresultItems;
    
    @ActionForm
    @Resource
    protected UnseiresultForm unseiresultForm;

    @Resource
    protected UnseiresultService unseiresultService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        unseiresultItems = unseiresultService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show")
    public String show() {
        Unseiresult entity = unseiresultService.findById();
        Beans.copy(entity, unseiresultForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit")
    public String edit() {
        Unseiresult entity = unseiresultService.findById();
        Beans.copy(entity, unseiresultForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete", redirect = true)
    public String delete() {
        Unseiresult entity = Beans.createAndCopy(Unseiresult.class, unseiresultForm).dateConverter("yyyy-MM-dd").execute();
        unseiresultService.delete(entity);
        return "/unseiresult/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Unseiresult entity = Beans.createAndCopy(Unseiresult.class, unseiresultForm).dateConverter("yyyy-MM-dd").execute();
        unseiresultService.insert(entity);
        return "/unseiresult/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Unseiresult entity = Beans.createAndCopy(Unseiresult.class, unseiresultForm).dateConverter("yyyy-MM-dd").execute();
        unseiresultService.update(entity);
        return "/unseiresult/";
    }
}