package com.sixthMan.smartFarm.Plants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @GetMapping("/write")
    String write(){
        return "write.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "index.html";
    }
}
