package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.com.model.Customer;
import vn.com.service.CustomerService;
import vn.com.service.impl.CustomerServiceImpl;

@Controller
public class CustomerDeleteController {
    CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/customer/{id}/delete")
    public String delete(@PathVariable int id){
        customerService.remove(id);
        return "redirect:/";
    }
}
