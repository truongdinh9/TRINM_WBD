package com.vn.code.security.controller;

import com.vn.code.security.model.User;
import com.vn.code.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = {"/","/login"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/login");
        return modelAndView;
    }

    @GetMapping(value = {"/signup"})
    public ModelAndView sigup(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user/signup");
        return  modelAndView;
    }

    @GetMapping("/home/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());

        modelAndView.addObject("userName", user.getUserName());
        modelAndView.setViewName("home/home");
        return modelAndView;
    }

    @PostMapping("/signup")
    public ModelAndView createUser(@Valid User user, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        User userExists =  userService.findUserByEmail(user.getUserName());
        if (userExists != null){
            bindingResult.rejectValue("userName","This email already exists");
        }
        if (bindingResult.hasErrors()){
            modelAndView.setViewName("user/signup");
        }else {
            userService.saveUser(user);
            modelAndView.addObject("msg","User  has been resgiter successlly");
            modelAndView.addObject("user",new User());
            modelAndView.setViewName("user/signup");
        }
        return  modelAndView;
    }

    @GetMapping(value = {"*/denied"})
    public ModelAndView denied(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("errors/denied");
        return modelAndView;
    }
}
