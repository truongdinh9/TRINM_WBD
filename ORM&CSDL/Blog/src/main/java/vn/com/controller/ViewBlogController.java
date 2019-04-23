package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class ViewBlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/viewBlog/{id}")
    public ModelAndView view(@PathVariable Long id,
                             ModelAndView modelAndView) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog",blog);
            return modelAndView;
        } else
            modelAndView = new ModelAndView("/error404");
        return modelAndView;
    }

}
