package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@RestController
public class CreateController {

    @Autowired
    BlogService blogService;

    @PostMapping("/blogs")
    public ResponseEntity<Void> createBlog(@RequestBody Blog blog,
                                           UriComponentsBuilder uriComponentsBuilder){
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/blogs/{id}").buildAndExpand(blog.getId()).toUri());
        return  new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
