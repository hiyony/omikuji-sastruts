package org.seasar.sastruts.omikuji.action;



import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import org.seasar.sastruts.omikuji.entity.Omikujii;
import org.seasar.sastruts.omikuji.service.OmikujiiService;
import org.seasar.sastruts.omikuji.form.OmikujiiForm;

public class OmikujiiAction {


    public List<Omikujii> omikujiiItems;
    
    @ActionForm
    @Resource
    protected OmikujiiForm omikujiiForm;

    @Resource
    protected OmikujiiService omikujiiService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        omikujiiItems = omikujiiService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show")
    public String show() {
        Omikujii entity = omikujiiService.findById();
        Beans.copy(entity, omikujiiForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit")
    public String edit() {
        Omikujii entity = omikujiiService.findById();
        Beans.copy(entity, omikujiiForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete", redirect = true)
    public String delete() {
        Omikujii entity = Beans.createAndCopy(Omikujii.class, omikujiiForm).dateConverter("yyyy-MM-dd").execute();
        omikujiiService.delete(entity);
        return "/omikujii/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Omikujii entity = Beans.createAndCopy(Omikujii.class, omikujiiForm).dateConverter("yyyy-MM-dd").execute();
        omikujiiService.insert(entity);
        return "/omikujii/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Omikujii entity = Beans.createAndCopy(Omikujii.class, omikujiiForm).dateConverter("yyyy-MM-dd").execute();
        omikujiiService.update(entity);
        return "/omikujii/";
    }
}