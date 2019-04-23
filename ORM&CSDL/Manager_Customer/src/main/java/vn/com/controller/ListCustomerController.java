package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Customer;
import vn.com.service.CustomerService;

import java.util.List;

@Controller
public class ListCustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/customers")
    public ModelAndView listCustomers(){
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers",customers);
        return modelAndView;
    }
}
