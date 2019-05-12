package com.vn.code.mokup.note.service.impl;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import com.vn.code.mokup.note.repository.NoteRepository;
import com.vn.code.mokup.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NoteServiceImpl  implements NoteService {

    @Autowired
    NoteRepository noteRepository;


    @Override
    public Page<Note> findAll(Pageable pageable) {
        return noteRepository.findAll(pageable);
    }

    @Override
    public Page<Note> findAllByTitleContaining(String title, Pageable pageable) {
        return noteRepository.findAllByTitleContaining(title,pageable);
    }

    @Override
    public Optional<Note> findById(Long id) {
        return noteRepository.findById(id);
    }

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void remove(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Iterable<Note> findAllByType(Optional<Type> type) {
        return noteRepository.findAllByType(type);
    }
}
