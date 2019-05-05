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
public class DeleteController {
    @Autowired
    BlogService blogService;

    @DeleteMapping("/blogs/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Long id){
        Blog blog1 = blogService.findById(id);
        if (blog1 ==  null){
            return  new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return  new ResponseEntity<Blog>(HttpStatus.NO_CONTENT);
    }

}
