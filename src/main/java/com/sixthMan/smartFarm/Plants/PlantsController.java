package com.sixthMan.smartFarm.Plants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlantsController {
    @GetMapping("/")
    @ResponseBody
    String hello(){
        return "안녕하쇼";
    }

//    @GetMapping("/write")
//    String list(){
//        return "write.html"
//    }

//    @GetMapping("/presigned-url")
//    @ResponseBody
//    String getURL(@RequestParam String filename){
//        var result = s3Service.createPresignedUrl("test/" + filename);
//        return result;
//    }
}
