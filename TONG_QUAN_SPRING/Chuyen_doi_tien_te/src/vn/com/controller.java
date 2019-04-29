package vn.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class controller {
    @PostMapping("/convert")
    public String convert( double e, Model model) {
        double usd = e / 23000;
        model.addAttribute("vn", e);
        model.addAttribute("usd", usd);
        return "index";
    }

    @GetMapping("/convert")
    public String getConvert(){
        return  "index";
    }
}
