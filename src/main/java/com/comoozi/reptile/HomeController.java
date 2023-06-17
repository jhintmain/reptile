package com.comoozi.reptile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        System.out.println("123123123");
        return "index";
    }
}
