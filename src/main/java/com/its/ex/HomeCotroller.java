package com.its.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCotroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/save")
    public String save(){
        return "save";
    }
}
