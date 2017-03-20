package com.jsf.application.action.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConfigurationDetail {

    private String configName;
    private String configValue;

    public ConfigurationDetail(String configName, String configValue) {
        this.configName = configName;
        this.configValue = configValue;
    }
}
