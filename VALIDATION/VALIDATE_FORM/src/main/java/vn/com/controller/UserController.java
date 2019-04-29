package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.User;

@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView showForm( ModelAndView modelAndView,
                                  User user) {
        modelAndView = new ModelAndView("/index");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    @PostMapping
    public ModelAndView checkValiddation(@Validated@ModelAttribute("user") User user,
                                         BindingResult bindingResult,
                                         ModelAndView modelAndView){
        if (bindingResult.hasFieldErrors()){
            modelAndView = new ModelAndView("/index");
            return  modelAndView;
        }else {
            modelAndView = new ModelAndView("/result");
            return modelAndView;
        }
    }
}
