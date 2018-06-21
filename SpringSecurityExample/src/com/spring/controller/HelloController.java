package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
public ModelAndView welcomePage() {

    ModelAndView model = new ModelAndView();
    model.addObject("title", "Spring Security Simple Example- Home");
    model.addObject("message", "Welcome page is shown,Not Protected directly accesed!");
    model.setViewName("hello");
    return model;

}

@RequestMapping(value = "/admin**", method = RequestMethod.GET)
public ModelAndView adminPage() {

    ModelAndView model = new ModelAndView();
    model.addObject("title", "Spring Security Simple example - Admin");
    model.addObject("message", "This is protected page,Can't be accessed directly!");
    model.setViewName("admin");

    return model;

}
}