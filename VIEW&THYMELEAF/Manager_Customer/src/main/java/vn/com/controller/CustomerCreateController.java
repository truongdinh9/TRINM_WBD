package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.com.model.Customer;
import vn.com.service.CustomerService;
import vn.com.service.impl.CustomerServiceImpl;

@Controller
public class CustomerCreateController {
    CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/customer/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/customer/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        customer.setId((int)(Math.random()*10000) );
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Saved customer succesfly");
        return "redirect:/";
    }
}
