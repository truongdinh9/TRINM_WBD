package com.vn.code.mokup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sfsdf {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
