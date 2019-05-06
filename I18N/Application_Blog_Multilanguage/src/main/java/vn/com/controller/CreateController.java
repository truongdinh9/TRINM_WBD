package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class CreateController {

    @Autowired
    BlogService blogService;

    @GetMapping("/blogCreate")
    public ModelAndView showCreate(@ModelAttribute("blog") Blog blog,
                                   ModelAndView modelAndView) {
        modelAndView = new ModelAndView("/blog/blogCreate");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/blogCreate")
    public ModelAndView create(Blog blog,
                               ModelAndView modelAndView) {
        blogService.save(blog);
        modelAndView = new ModelAndView("/blog/blogCreate");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message","success");
        return modelAndView;
    }
}
