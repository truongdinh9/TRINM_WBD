package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Province;
import vn.com.service.ProvinceService;

@Controller
public class CreateProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/createProvince")
    public ModelAndView showCreateFomr(ModelAndView modelAndView,
                                       Province province) {
        modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", province);
        return modelAndView;
    }

    @PostMapping("/createProvince")
    public ModelAndView save(@ModelAttribute("province") Province province,
                             ModelAndView modelAndView) {
        provinceService.save(province);
        modelAndView = new ModelAndView("/province/create");
        modelAndView.addObject("province", province);
        modelAndView.addObject("message", "add success");
        return modelAndView;
    }
}
