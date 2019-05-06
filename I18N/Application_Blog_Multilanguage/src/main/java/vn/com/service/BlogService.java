package vn.com.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.model.Blog;

public interface BlogService  {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByNameContaining(String name, Pageable pageable);

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);


}
