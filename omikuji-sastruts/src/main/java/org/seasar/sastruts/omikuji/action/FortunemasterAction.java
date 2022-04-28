package org.seasar.sastruts.omikuji.action;



import javax.annotation.Resource;

import org.apache.struts.action.ActionMessages;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import java.util.List;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import org.seasar.sastruts.omikuji.entity.Fortunemaster;
import org.seasar.sastruts.omikuji.service.FortunemasterService;
import org.seasar.sastruts.omikuji.form.FortunemasterForm;

public class FortunemasterAction {


    public List<Fortunemaster> fortunemasterItems;
    
    @ActionForm
    @Resource
    protected FortunemasterForm fortunemasterForm;

    @Resource
    protected FortunemasterService fortunemasterService;

    public JdbcManager jdbcManager;

    @Execute(validator = false)
    public String index() {
        fortunemasterItems = fortunemasterService.findAll();

        return "list.jsp";
    }





    @Execute(validator = false, urlPattern = "show")
    public String show() {
        Fortunemaster entity = fortunemasterService.findById();
        Beans.copy(entity, fortunemasterForm).dateConverter("yyyy-MM-dd").execute();
        return "show.jsp";
    }

    @Execute(validator = false, urlPattern = "edit")
    public String edit() {
        Fortunemaster entity = fortunemasterService.findById();
        Beans.copy(entity, fortunemasterForm).dateConverter("yyyy-MM-dd").execute();
        return "edit.jsp";
    }

    @Execute(validator = false)
    public String create() {
        return "create.jsp";
    }

    @Execute(validator = false, urlPattern = "delete", redirect = true)
    public String delete() {
        Fortunemaster entity = Beans.createAndCopy(Fortunemaster.class, fortunemasterForm).dateConverter("yyyy-MM-dd").execute();
        fortunemasterService.delete(entity);
        return "/fortunemaster/";
    }

    @Execute(input = "create.jsp", redirect = true)
    public String insert() {
        Fortunemaster entity = Beans.createAndCopy(Fortunemaster.class, fortunemasterForm).dateConverter("yyyy-MM-dd").execute();
        fortunemasterService.insert(entity);
        return "/fortunemaster/";
    }

    @Execute(input = "edit.jsp", redirect = true)
    public String update() {
        Fortunemaster entity = Beans.createAndCopy(Fortunemaster.class, fortunemasterForm).dateConverter("yyyy-MM-dd").execute();
        fortunemasterService.update(entity);
        return "/fortunemaster/";
    }
}