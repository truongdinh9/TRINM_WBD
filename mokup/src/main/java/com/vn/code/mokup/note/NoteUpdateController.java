package com.vn.code.mokup.note;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.note.service.NoteService;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class NoteUpdateController {

    @Autowired
    TypeService typeService;

    @Autowired
    NoteService noteService;

    @ModelAttribute("types")
    public Iterable<Type> types(){
        return typeService.findAll();
    }


    @GetMapping("/editNote/{id}")
    public ModelAndView edit(@PathVariable Long id){
       Optional<Note> note = noteService.findById(id);
        ModelAndView  modelAndView = new ModelAndView("note/update");
        modelAndView.addObject("note",note);
        return modelAndView;
    }

    @PostMapping("/updateNote")
    public  ModelAndView save(Note note) {
        noteService.save(note);
       ModelAndView modelAndView =  new ModelAndView("note/update");
       modelAndView.addObject("note",note);
       modelAndView.addObject("message","update succes");
       return modelAndView;
    }
}
