package com.jsf.application.action.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    public String moveToConfig() {
        return "config";
    }

    public String moveToErrors() {
        return "error";
    }
}
