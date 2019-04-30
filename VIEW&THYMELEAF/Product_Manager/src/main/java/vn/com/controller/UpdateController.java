package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.com.model.Product;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

@Controller
public class UpdateController {
    private ProductService productService = new ProductServiceImpl();
    @GetMapping("/editProduct/{id}")
    public String loadUpdate(Model model,
                             @PathVariable int id){
      Product product = productService.findById(id);
        model.addAttribute("products",product);
        return "update";
    }

    @PostMapping("/product/update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        productService.update(product.getId(),product);
        redirectAttributes.addFlashAttribute("success", "Modified product successfully!");
        return "redirect:/";
    }
}
