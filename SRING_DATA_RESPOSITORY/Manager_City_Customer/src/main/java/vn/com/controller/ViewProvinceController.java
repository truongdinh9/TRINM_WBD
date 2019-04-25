package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Customer;
import vn.com.model.Province;
import vn.com.service.CustomerService;
import vn.com.service.ProvinceService;

@Controller
public class ViewProvinceController {
    @Autowired
    ProvinceService provinceService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/viewProvince/{id}")
    public ModelAndView viewProvice(@PathVariable("id") Long id,
                                    Province province){
        province = provinceService.findById(id);
        if (province == null){
            return new ModelAndView("/error404");
        }
        Iterable<Customer> customers = customerService.findAllByProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/view");
        modelAndView.addObject("provence",province);
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
