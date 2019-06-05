//package com.vn.code.mokup.type;
//
//import com.vn.code.mokup.entity.Note;
//import com.vn.code.mokup.entity.Type;
//import com.vn.code.mokup.note.service.NoteService;
//import com.vn.code.mokup.type.service.TypeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Controller
//public class TypeDeleteController {
//
//    @Autowired
//    TypeService typeService;
//
//    @Autowired
//    NoteService noteService;
//
//    @GetMapping("/deleteType/{id}")
//    public ModelAndView delete(@PathVariable Long id,
//                               ModelAndView modelAndView,
//                               RedirectAttributes rm){
//        Optional<Type> type = typeService.findById(id);
//        Iterable<Note> notes = noteService.findAllByType(type);
//        boolean check = ((List)notes).isEmpty();
//        if (check){
//            typeService.remove(id);
//            rm.addFlashAttribute("message", "delete type" );
//            modelAndView = new ModelAndView("redirect:/type");
//            return modelAndView;
//        }else {
//            modelAndView = new ModelAndView("redirect:/type");
//            rm.addFlashAttribute("message", "not delete type" );
//            return modelAndView;
//        }
//    }
//}
