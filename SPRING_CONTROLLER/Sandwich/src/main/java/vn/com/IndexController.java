package vn.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "/index";
    }
    @PostMapping("/save")
    public String result(ModelMap modelMap,
                         @RequestParam String checkBox){
        modelMap.addAttribute("check",checkBox);
        return "/result";
    }
}
