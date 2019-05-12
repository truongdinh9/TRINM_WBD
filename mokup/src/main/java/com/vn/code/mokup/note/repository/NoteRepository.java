package com.vn.code.mokup.note.repository;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends PagingAndSortingRepository<Note,Long> {
    Page<Note> findAllByTitleContaining (String title, Pageable pageable);
    Iterable<Note> findAllByType(Optional<Type> type);
}
