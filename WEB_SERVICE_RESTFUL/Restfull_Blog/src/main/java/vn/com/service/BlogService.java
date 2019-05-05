package vn.com.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.model.Blog;

import java.util.List;

public interface BlogService  {
    List<Blog> findAll();

    Blog findById(Long id);

    void save (Blog blog);

    void remove(Long id);

}
