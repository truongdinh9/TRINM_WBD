package com.vn.code.mokup.note;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.note.service.NoteService;
import com.vn.code.mokup.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class NoteListController {

    @Autowired
    NoteService noteService;
    @Autowired
    TypeService typeService;

    @ModelAttribute("types")
    public Iterable<Type> types() {
        return typeService.findAll();
    }

    @GetMapping("/note")
    public ModelAndView list(@PageableDefault(size = 5) Pageable pageable,
                             @RequestParam("s") Optional<String> s,
                             @RequestParam("type_id") Optional<Long> type_id) {
        ModelAndView modelAndView = new ModelAndView("note/list");
        Page<Note> notes; // page chua ket qua tra ve
        if (s.isPresent()) { // isPresent de kiem tra doi tuong nay co rong hay khong neu rong thi no tra ve false
            notes = noteService.findAllByTitleContaining(s.get(), pageable);
        } else if (type_id.isPresent()) {
            Optional<Type> type = typeService.findById(type_id.get());
            notes = noteService.findAllByType(type, pageable);
            modelAndView.addObject("type_id", type_id.get());
        } else {
            notes = noteService.findAll(pageable);
        }
        modelAndView.addObject("notes", notes);
        return modelAndView;
    }
}
