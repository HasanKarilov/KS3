package com.springapp.mvc.controller;

import com.springapp.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by hanaria on 2/12/16.
// */
@SessionAttributes("user")
@Controller
public class RegistrationController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView printWelcome() {

        return new ModelAndView("registration", "user", new User());
    }


    @RequestMapping(value = "/customerStart", method = RequestMethod.POST)
    public String showInfor(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model){
//		return new ModelAndView("showinfor", "user", user);

        if(bindingResult.hasErrors()){
            return "registration";
        }
        model.addAttribute("user", user);
        return "customer/customerStart";
    }


//	Date date = new Date();
//	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
//	String str = dateFormat.format(date);
//
//	model.addAttribute("message", str);
}

