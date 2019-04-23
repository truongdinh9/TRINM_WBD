package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.com.service.CustomerService;
import vn.com.service.impl.CustomerServiceImpl;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }
}
