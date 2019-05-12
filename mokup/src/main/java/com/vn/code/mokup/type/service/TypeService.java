package com.vn.code.mokup.type.service;

import com.vn.code.mokup.entity.Note;
import com.vn.code.mokup.entity.Type;

import java.util.Optional;

public interface TypeService {

    Iterable<Type> findAll();

    Optional<Type> findById(Long id);

    void  save(Type type);

    void remove(Long id);

}
