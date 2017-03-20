package com.jsf.application.action.listener;

import java.util.logging.Logger;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;


public class LoginActivityListener implements ActionListener {

    private static final Logger LOGGER = Logger.getLogger(LoginActivityListener.class.getName());

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        LOGGER.info(event.getSource().toString());
    }

}
