package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.dao.UserDao;
import vn.com.model.Login;
import vn.com.model.User;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView getLogin() {
        ModelAndView modelAndView = new ModelAndView("home");
        Login login = new Login();
        modelAndView.addObject("loginForm", login);
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("loginForm") Login login){
        User user = UserDao.checkLogin(login);
        if (user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return  modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("userForm",user);
            return  modelAndView;
        }
    }
}
