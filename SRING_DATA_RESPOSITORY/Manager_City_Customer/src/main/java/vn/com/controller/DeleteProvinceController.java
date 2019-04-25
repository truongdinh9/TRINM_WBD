package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import vn.com.service.ProvinceService;

@Controller
public class DeleteProvinceController {
    @Autowired
    ProvinceService provinceService;
    @GetMapping("/deleteProvince/{id}")
    public ModelAndView delete(@PathVariable Long id,
                               ModelAndView modelAndView){
        provinceService.remove(id);
        modelAndView = new ModelAndView("redirect:/provinces");
        return  modelAndView;
    }
}
