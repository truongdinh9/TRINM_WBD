package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import vn.com.service.CustomerService;

@Controller
public class DeleteCustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/delete-customer/{id}")
    public ModelAndView delete(@PathVariable Long id, ModelAndView modelAndView) {
        customerService.remove(id);
        modelAndView = new ModelAndView("redirect:/customers");
        return modelAndView;
    }
}
