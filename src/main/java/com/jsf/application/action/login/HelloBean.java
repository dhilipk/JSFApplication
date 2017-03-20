package com.jsf.application.action.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

import lombok.Getter;

@ManagedBean(name = "hello", eager = true)
@RequestScoped
@Getter
public class HelloBean {

    private String message = "Hello World!";
    private String commandUsingJSF = "Using JSF outcome";
    private String commandUsingBean = "Using Managed Bean";

    public HelloBean() {
        //To show how the bean is getting instantiated
        System.out.println("HelloBean started!");
    }

    public void handleEvent(ComponentSystemEvent event) {
        message = "Hello World Handler Event";
    }

}
