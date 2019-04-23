package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class UpdateBlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/updateBlog/{id}")
    public ModelAndView showUpdateFrom(@PathVariable Long id){
        Blog blog = blogService.findById(id);
        if(blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/updateBlog")
    public  ModelAndView update(@ModelAttribute("blog") Blog blog,
                                ModelAndView modelAndView){
        blogService.save(blog);
        modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("bog", blog);
        modelAndView.addObject("message","update succes");
        return modelAndView;
    }
}
