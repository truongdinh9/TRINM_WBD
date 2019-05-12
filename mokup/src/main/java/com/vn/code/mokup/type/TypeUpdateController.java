package com.vn.code.mokup.type;


import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class TypeUpdateController {

    @Autowired
    TypeService typeService;

    @GetMapping("/editType/{id}")
    public ModelAndView edit(@PathVariable Long id,
                             ModelAndView modelAndView) {
        Optional<Type> type = typeService.findById(id);
        modelAndView = new ModelAndView("type/update");
        modelAndView.addObject("type", type);
        return modelAndView;
    }

    @PostMapping("/updateType")
    public ModelAndView update(ModelAndView modelAndView,
                               Type type,
                               RedirectAttributes rm) {
        typeService.save(type);
        modelAndView = new ModelAndView("redirect:/type");
        rm.addFlashAttribute("message", "update success name:" + type.getName());
        modelAndView.addObject("type", type);
        return modelAndView;
    }
}
