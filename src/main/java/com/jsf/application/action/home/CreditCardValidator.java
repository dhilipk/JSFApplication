package com.jsf.application.action.home;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.commons.lang.math.NumberUtils;

@FacesValidator(value="com.jsf.application.action.home.CreditCardValidator")
public class CreditCardValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        //Do the actual credit card validation
        if(!NumberUtils.isNumber(value.toString())){
            FacesMessage msg = new FacesMessage("Credit Caed Conversion error", "Invalid Credit Card Number");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }

}
