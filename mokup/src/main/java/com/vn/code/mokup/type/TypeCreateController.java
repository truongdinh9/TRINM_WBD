//package com.vn.code.mokup.type;
//
//import com.vn.code.mokup.entity.Type;
//import com.vn.code.mokup.type.service.TypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//
//@Controller
//public class TypeCreateController {
//
//    @Autowired
//    TypeService typeService;
//
//    @GetMapping("/createType")
//    public ModelAndView create(Type type,
//                                   ModelAndView modelAndView){
//        modelAndView = new ModelAndView("type/create");
//        modelAndView.addObject("type",type);
//        return modelAndView;
//    }
//
//    @PostMapping("/saveType")
//    public ModelAndView save(ModelAndView modelAndView,
//                               Type type,
//                               RedirectAttributes rm){
//       typeService.save(type);
//       modelAndView = new ModelAndView("redirect:/type");
//       modelAndView.addObject("type",type);
//        rm.addFlashAttribute("message","add success name:" + type.getName());
//       return modelAndView;
//    }
//}
