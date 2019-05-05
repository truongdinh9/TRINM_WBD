package vn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.com.model.Blog;
import vn.com.service.BlogService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Controller
public class ListController {

    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ModelAndView list(@PageableDefault(size = 10, sort = "id") Pageable pageable,
                             @RequestParam("s") Optional<String> s,
                             ModelAndView modelAndView) {

        Page<Blog> blogs; // page chua ket qua tra ve
        if (s.isPresent()) { // isPresnent kiem tra xem doi tuong co rong hay khong neu rong thi tra ve false
            blogs = blogService.findAllByNameContaining(s.get(), pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        modelAndView = new ModelAndView("/blog/blogList");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
}
