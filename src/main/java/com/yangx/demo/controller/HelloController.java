package com.yangx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name="name", required=false)String name, Model model){
        model.addAttribute(name,"yangx");
        return "hello";
    }
}
