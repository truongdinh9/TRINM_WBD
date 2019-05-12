package com.vn.code.mokup.type;

import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class TypeDeleteController {

    @Autowired
    TypeService typeService;

    @GetMapping("/deleteType/{id}")
    public ModelAndView delete(@PathVariable Long id,
                               ModelAndView modelAndView,
                               RedirectAttributes rm){

     try {
         typeService.remove(id);
         rm.addFlashAttribute("message", "delete type" );
         modelAndView = new ModelAndView("redirect:/type");
         return modelAndView;
     }catch (Exception e){
         rm.addFlashAttribute("message", "Khong the xoa" );
         modelAndView = new ModelAndView("redirect:/type");
         return modelAndView;
     }
    }
}
