package vn.com.base;

import java.util.List;

public interface BaseRepository<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E model);

    void remove(Long id);
}
