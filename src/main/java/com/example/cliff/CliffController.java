package com.example.cliff;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CliffController {
    @GetMapping("/")
    public String products(){
        return "products";
    }
}
