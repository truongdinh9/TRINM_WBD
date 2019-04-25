package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Customer;
import vn.com.model.Province;
import vn.com.service.CustomerService;
import vn.com.service.ProvinceService;

import java.util.Optional;


@Controller
public class ListCustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping("/customers")
    public ModelAndView listCustomers(Pageable pageable,
                                      @RequestParam("s")Optional<String> s) {
        Page<Customer> customers;
        if (s.isPresent()){ // isPresent de kiem tra doi tuong nay co rong~ hay k neu rong~ thi no tra va fasle
            customers = customerService.findAllByFirstNameContaining(s.get(),pageable);
        }else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
