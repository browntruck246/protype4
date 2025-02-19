package com.sears.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;


@Controller
public class MainController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        System.out.println("*** sayHello ***" );

        return "Hello, World!";
    }

    @GetMapping("/index")
    public String index(Model model) {
        System.out.println("*** index ***" );
        
       return "index";
    }
    
    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("*** home ***" );
        
        model.addAttribute("message", "Hello World!");
        
       return "home";
    }

    

}
