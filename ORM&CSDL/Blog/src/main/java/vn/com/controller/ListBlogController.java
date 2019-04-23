package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

import java.util.List;

@Controller
public class ListBlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blogs")
    public ModelAndView loadList(ModelAndView modelAndView) {
        List<Blog> blogs = blogService.findAll();
        modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
}
