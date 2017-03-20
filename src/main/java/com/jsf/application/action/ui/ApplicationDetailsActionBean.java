package com.jsf.application.action.ui;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApplicationScoped
@ManagedBean(name = "applicationDetails")
public class ApplicationDetailsActionBean implements ApplicationDetails{

    private String applicationName = "JSF Application";
    public String getName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
