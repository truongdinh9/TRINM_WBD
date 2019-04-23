package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.com.model.Customer;
import vn.com.service.CustomerService;
import vn.com.service.impl.CustomerServiceImpl;

@Controller
public class CustomerUpdateController {
    CustomerService customerService =  new CustomerServiceImpl();

    @GetMapping("/customer/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }
    @PostMapping("/customer/update")
    public  String update(Customer customer, RedirectAttributes redirectAttributes){
        customerService.update(customer.getId(),customer);
        redirectAttributes.addFlashAttribute("success","Modefier customer success");
        return "redirect:/";
    }
}
