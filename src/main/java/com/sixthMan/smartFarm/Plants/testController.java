package com.sixthMan.smartFarm.Plants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {
    @GetMapping("/write")
    String write(){
        return "write.html";
    }
}
