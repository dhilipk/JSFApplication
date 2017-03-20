package com.jsf.application.action.config;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name = "appConfigurationAction", eager = true)
public class AppConfigurationActionBean implements AppConfiguration {

    private List<ConfigurationDetail> configDetails;

    public AppConfigurationActionBean() {
        configDetails = new ArrayList<ConfigurationDetail>();
        configDetails.add(new ConfigurationDetail("Application Name", "JSF Application"));
        configDetails.add(new ConfigurationDetail("Application Version", "1.0"));
        configDetails.add(new ConfigurationDetail("Application Debug State", "false"));
    }

    public List<ConfigurationDetail> getConfigDetails() {
        return configDetails;
    }
}
