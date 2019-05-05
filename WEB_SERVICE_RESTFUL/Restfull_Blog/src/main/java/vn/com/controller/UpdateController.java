package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class UpdateController {
    @Autowired
    BlogService blogService;

    @PutMapping("/blogs/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Long id,
                                           @RequestBody Blog blog){
        Blog blog1 = blogService.findById(id);
        if (blog1 ==  null){
            return  new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blog1.setName(blog.getName());
        blog1.setDate(blog.getDate());
        blog1.setContent(blog.getContent());
        blogService.save(blog1);
        return  new ResponseEntity<Blog>(blog1,HttpStatus.OK);
    }
}

