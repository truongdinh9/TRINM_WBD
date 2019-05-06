package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class UpdateController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blogUpdate/{id}")
    public ModelAndView showUpdate(Blog blog,
                                   ModelAndView modelAndView,
                                   @PathVariable Long id) {
        blog = blogService.findById(id);
        modelAndView = new ModelAndView("/blog/blogUpdate");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @PostMapping("/blogUpdate")
    public ModelAndView update(Blog blog,
                               ModelAndView modelAndView){
        blogService.save(blog);
        modelAndView = new ModelAndView("/blog/blogUpdate");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message","label.update.success");
        return modelAndView;
    }
}

