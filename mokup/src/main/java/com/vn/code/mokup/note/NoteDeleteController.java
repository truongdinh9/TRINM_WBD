package com.vn.code.mokup.note;

import com.vn.code.mokup.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteDeleteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/deleteNote/{id}")
    public ModelAndView remove(@PathVariable Long id,
                               ModelAndView modelAndView){
       try {
           noteService.remove(id);
           modelAndView = new ModelAndView("redirect:/note");
           return modelAndView;
       }catch (Exception e){
           modelAndView = new ModelAndView("redirect:/note");
           return modelAndView;
       }
    }
}
