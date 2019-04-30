package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

@Controller
public class DeleteController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/deleteProduct/{id}")
    public String delete(@PathVariable int id, Model model, RedirectAttributes redirectAttributes) {
        productService.remove(id);
        redirectAttributes.addFlashAttribute("success", "delete product successfully!");
        return "redirect:/";
    }
}
