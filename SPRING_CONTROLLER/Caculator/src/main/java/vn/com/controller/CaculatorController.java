package vn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class CaculatorController {
    private static double result = 0;

    @GetMapping
    public String index() {
        return "/index";
    }

    @RequestMapping(params = "btnAddition")
    public String addition(ModelMap modelMap,
                           @RequestParam double numberOne,
                           @RequestParam double numberTwo) {
        result = numberOne + numberTwo;
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("numberOne", numberOne);
        modelMap.addAttribute("numberTwo", numberTwo);
        return "/index";
    }

    @RequestMapping(params = "btnSubtration")
    public String subtration(ModelMap modelMap,
                             @RequestParam double numberOne,
                             @RequestParam double numberTwo) {
        result = numberOne - numberTwo;
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("numberOne", numberOne);
        modelMap.addAttribute("numberTwo", numberTwo);
        return "/index";
    }

    @RequestMapping(params = "btnMultiplication")
    public String multiplication(ModelMap modelMap,
                                 @RequestParam double numberOne,
                                 @RequestParam double numberTwo) {
        result = numberOne * numberTwo;
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("numberOne", numberOne);
        modelMap.addAttribute("numberTwo", numberTwo);
        return "/index";
    }

    @RequestMapping(params = "btnDivision")
    public String division(ModelMap modelMap,
                           @RequestParam double numberOne,
                           @RequestParam double numberTwo) {
        result = numberOne / numberTwo;
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("numberOne", numberOne);
        modelMap.addAttribute("numberTwo", numberTwo);
        return "/index";
    }
}
