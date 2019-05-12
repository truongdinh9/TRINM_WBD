package com.vn.code.mokup.note;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class NoteListController {

    @Autowired
    NoteService noteService;

    @GetMapping("/note")
    public ModelAndView list(ModelAndView modelAndView,
                             @PageableDefault(size = 5) Pageable pageable,
                             @RequestParam("s") Optional<String> s) {
        Page<Note> notes; // page chua ket qua tra ve
        if (s.isPresent()) { // isPresent de kiem tra doi tuong nay co rong hay khong neu rong thi no tra ve false
            notes = noteService.findAllByTitleContaining(s.get(), pageable);
        } else {
            notes = noteService.findAll(pageable);
        }
        modelAndView = new ModelAndView("note/list");
        modelAndView.addObject("notes", notes);
        return modelAndView;
    }
}
