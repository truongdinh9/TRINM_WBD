package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Customer;
import vn.com.model.Province;
import vn.com.service.CustomerService;
import vn.com.service.ProvinceService;

import javax.validation.Valid;

@Controller
public class CreateCustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;


    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return provinceService.findAll();
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        ;
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer( @Valid  @ModelAttribute("customer")  Customer customer,
                                     BindingResult bindingResult,
                                    ModelAndView modelAndView) {

        new Customer().validate(customer,bindingResult);

        if (bindingResult.hasFieldErrors()){
            modelAndView = new ModelAndView("/customer/create");
            return  modelAndView;
        }
        customerService.save(customer);
        modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("message", "New customer create success");

        return modelAndView;
    }
}
