package vn.com.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.com.model.Item;
import vn.com.service.ProductService;
import vn.com.service.impl.ProductServiceImpl;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {

    private ProductService productService = new ProductServiceImpl();
    @GetMapping("/cart")
    public String index(HttpSession session, Model model){
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        int amount = 0;
        if (cart != null){
            for (Item item: cart) {
                amount = (int) (amount + item.getQuantity() * item.getProduct().getPrice());
            }
        }
        model.addAttribute("amount", amount);
        return "cart/listCart";
    }

    @GetMapping("/buyProduct/{id}")
    public String buy(@PathVariable("id") int  id, HttpSession session){

        if (session.getAttribute("cart") == null){
            List<Item> items = new ArrayList<Item>();
            items.add(new Item(productService.find(id),1));
            session.setAttribute("cart",items);
        } else {
            List<Item> items = (List<Item>) session.getAttribute("cart");
            int index = exists(id,items);
            if (index == -1){
                items.add(new Item(productService.find(id),1));
            }else {
                int quantity = items.get(index).getQuantity() + 1;
                items.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", items);
        }
        return "redirect:/cart";
    }

    @GetMapping(value = "/removeProduct/{id}" )
    public String remove(@PathVariable("id") int id, HttpSession session) {
        List<Item> items = (List<Item>) session.getAttribute("cart");
        int index = exists(id,items);
        items.remove(index);
        session.setAttribute("cart",items);
        return "cart/listCart";
    }

    private int exists(int id, List<Item> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProduct().getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
