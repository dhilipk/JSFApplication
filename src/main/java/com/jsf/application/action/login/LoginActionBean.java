package com.jsf.application.action.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RequestScoped
@ManagedBean(name="loginAction", eager = true)
public class LoginActionBean {

    private String login;
    private String password;

    public String authenticate() {
        return "appHome";
    }
}
