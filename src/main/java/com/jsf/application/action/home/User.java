package com.jsf.application.action.home;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RequestScoped
@ManagedBean(name="user", eager = true)
public class User {

    private String creditCardNumber;
    private String name;
    private String stringElement;
    private String welcomeMessage;
    
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        welcomeMessage = "JSF Application welcomes you " + name;
        return welcomeMessage;
    }
}
