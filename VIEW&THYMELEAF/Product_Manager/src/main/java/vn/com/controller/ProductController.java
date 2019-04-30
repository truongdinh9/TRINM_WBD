package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String index (Model model){
        model.addAttribute("products", productService.findAll());
        return "index";
    }
}
