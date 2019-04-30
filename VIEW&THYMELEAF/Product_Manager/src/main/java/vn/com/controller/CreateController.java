package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.com.model.Product;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

@Controller
public class CreateController {

    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/product/create")
    public  String loadCreate(Model model){
        model.addAttribute("products", new Product());
        return  "create";
    }
    @PostMapping("/product/save")
    public String save(Product product, RedirectAttributes redirectAttributes){
        product.setId((int)(Math.random() * 10000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/";
    }
}
