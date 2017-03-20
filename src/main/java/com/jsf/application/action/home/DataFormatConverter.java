package com.jsf.application.action.home;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.validator.FacesValidator;

import org.apache.commons.lang.math.NumberUtils;

@FacesValidator("dataFormatConverter")
public class DataFormatConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String data) {

        //Do the actual conversion business logic
        if(!NumberUtils.isNumber(data)){
            FacesMessage msg = new FacesMessage("Credit Caed Conversion error", "Invalid Credit Card Number");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }

        return data;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
