package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Province;
import vn.com.service.ProvinceService;

@Controller
public class ListProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/provinces")
    public ModelAndView listProvince(ModelAndView modelAndView) {
        Iterable<Province> provinces = provinceService.findAll();
        modelAndView = new ModelAndView("/province/list");
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }
}
