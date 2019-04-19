package vn.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String getDictionary() {
        return "index";
    }

    @PostMapping("/dictionary")
    public String postDictinary(String search, Model model) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bye");

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Xin chao");
        stringArrayList.add("Tam biet");

        model.addAttribute("search",search);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(search)) {
                model.addAttribute("stringArrayList", stringArrayList.get(i));
            }
        }

//        Map<String, String> map = new HashMap<>();
//        map.put("hello","Xin Chao");
//        map.put("bye","tam biet");
//        String result = map.get(search);
//        model.addAttribute("search", search);
//        model.addAttribute("result", result);
        return "index";
    }
}
