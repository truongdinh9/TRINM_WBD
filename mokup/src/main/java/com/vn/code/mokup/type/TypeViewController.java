package com.vn.code.mokup.type;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.note.service.NoteService;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class TypeViewController {

    @Autowired
    TypeService typeService;

    @Autowired
    NoteService noteService;

    @GetMapping("/viewType/{id}")
    public ModelAndView view(@PathVariable Long id,
                             ModelAndView modelAndView) {
        Optional<Type> type = typeService.findById(id);
        Iterable<Note> notes = noteService.findAllByType(type);
        modelAndView = new ModelAndView("type/view");
        modelAndView.addObject("type",type);
        modelAndView.addObject("notes", notes);
        return modelAndView;
    }

}
