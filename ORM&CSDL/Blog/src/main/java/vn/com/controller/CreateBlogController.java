package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class CreateBlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/createBlog")
    public ModelAndView showCreateFrom(ModelAndView modelAndView,
                                       Blog blog) {
        modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/createBlog")
    public ModelAndView create(ModelAndView modelAndView, Blog blog) {

        blogService.save(blog);
        modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "create success");

        return modelAndView;
    }
}
