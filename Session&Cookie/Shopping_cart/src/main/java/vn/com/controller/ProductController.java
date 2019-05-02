package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

@Controller
public class ProductController {

    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/product")
    public String index (ModelMap modelMap){
        modelMap.put("products",productService.findAll());
        return "product/listProduct";
    }
}
