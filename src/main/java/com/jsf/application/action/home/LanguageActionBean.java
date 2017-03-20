package com.jsf.application.action.home;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ManagedBean(name="language")
@SessionScoped
public class LanguageActionBean {

    private Logger LOGGER = Logger.getLogger(LanguageActionBean.class.getName());

    private Map<String, Object> availableLocales;

    public LanguageActionBean() {
        availableLocales = new LinkedHashMap<String, Object>();
        availableLocales.put("English", Locale.ENGLISH);
        availableLocales.put("French", Locale.FRENCH);
    }

    private String selectedLocale;
    
    public void localeValueChangeListener(ValueChangeEvent event) {
        String localeNewValue = event.getNewValue().toString();
        LOGGER.info("Locale value changed from " + event.getOldValue() + " to " + localeNewValue);

        Set<Entry<String, Object>> locales = availableLocales.entrySet();
        for(Entry<String, Object> locale : locales) {
            if(locale.getValue().toString().equals(localeNewValue)){
                FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)locale.getValue());
            }
        }
    }
}
