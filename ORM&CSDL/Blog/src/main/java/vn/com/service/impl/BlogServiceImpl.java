package vn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import vn.com.model.Blog;
import vn.com.repository.BlogRepository;
import vn.com.service.BlogService;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }
}
