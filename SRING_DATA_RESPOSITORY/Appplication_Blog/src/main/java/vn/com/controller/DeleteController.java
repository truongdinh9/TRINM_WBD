package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

@Controller
public class DeleteController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blogDelete/{id}")
    public ModelAndView delete(ModelAndView modelAndView,
                               @PathVariable Long id){
        blogService.remove(id);
        modelAndView = new ModelAndView("redirect:/");
        return  modelAndView;
    }
}
