package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Customer;
import vn.com.service.CustomerService;

@Controller
public class UpdateCustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/edit-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id, ModelAndView modelAndView) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            modelAndView = new ModelAndView("/customer/edit");
            modelAndView.addObject("customer", customer);
            return modelAndView;
        } else {
            modelAndView = new ModelAndView("/error404");
            return modelAndView;
        }
    }
    @PostMapping("/edit-customer")
    public  ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer,
                                        ModelAndView modelAndView){
        customerService.save(customer);
        modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("message","update new success");
        return modelAndView;
    }
}
