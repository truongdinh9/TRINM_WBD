package com.vn.code.mokup.note;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.note.service.NoteService;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteCreateController {


    @Autowired
    TypeService typeService;

    @Autowired
    NoteService noteService;

    @ModelAttribute("types")
    public Iterable<Type> types(){
        return typeService.findAll();
    }

    @GetMapping("/createNote")
    public ModelAndView createNote(ModelAndView modelAndView,
                                   Note note) {
        modelAndView = new ModelAndView("note/create");
        modelAndView.addObject("note", note);
        return modelAndView;
    }

    @PostMapping("/saveNote")
    public ModelAndView create(ModelAndView modelAndView,
                               Note note) {
        noteService.save(note);
        modelAndView = new ModelAndView("note/create");
        modelAndView.addObject("note", note);
        modelAndView.addObject("message", "add success");
        return modelAndView;
    }
}
