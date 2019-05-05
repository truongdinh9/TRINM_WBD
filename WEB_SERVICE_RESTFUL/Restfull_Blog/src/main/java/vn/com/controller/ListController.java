package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

import java.util.List;
import java.util.Optional;


@RestController
public class ListController {

    @Autowired
    BlogService blogService;

    @GetMapping("/blogs/")
    public ResponseEntity<List<Blog>> listBlog() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        } else {
            return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
        }
    }

    //-------------------Retrieve Single Customer--------------------Tr ve blog voi ID ...------------------------------------

    @GetMapping(value = "blogs/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getBlog(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if ( blog == null){
            return  new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }else {
            return  new ResponseEntity<Blog>(blog,HttpStatus.OK);
        }
    }

}
