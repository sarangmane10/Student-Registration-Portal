package com.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex) {
        ModelAndView model = new ModelAndView("status"); // error.jsp or error.html
        model.addObject("message", "An unexpected error occurred!");
        model.addObject("reasone", "404 resource not found!");
        
        return model;
    }
}