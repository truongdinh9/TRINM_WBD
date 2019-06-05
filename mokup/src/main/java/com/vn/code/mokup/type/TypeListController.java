//package com.vn.code.mokup.type;
//
//import com.vn.code.mokup.entity.Type;
//import com.vn.code.mokup.type.service.TypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//public class TypeListController {
//
//    @Autowired
//    TypeService typeService;
//
//    @GetMapping("/type")
//    public ModelAndView list (ModelAndView modelAndView){
//      Iterable<Type>  types = typeService.findAll();
//
//      modelAndView = new ModelAndView();
//      modelAndView.setViewName("type/list");
//      modelAndView.addObject("types",types);
//      return modelAndView;
//    }
//
//}
