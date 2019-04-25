package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Province;
import vn.com.service.ProvinceService;

@Controller
public class UpdateProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/editProvince/{id}")
    public ModelAndView showUpdate(ModelAndView modelAndView,
                                   Province province,
                                   @PathVariable Long id) {
        province = provinceService.findById(id);
        if (province != null) {
            modelAndView = new ModelAndView("/province/edit");
            modelAndView.addObject("province", province);
            return modelAndView;
        } else {
            modelAndView = new ModelAndView("/error404");
            return modelAndView;
        }
    }

    @PostMapping("/editProvince")
    public ModelAndView update(ModelAndView modelAndView,
                               Province province) {
        provinceService.save(province);
        modelAndView = new ModelAndView("/province/edit");
        modelAndView.addObject("message", "update success");
        modelAndView.addObject("province", province);
        return modelAndView;

    }
}
