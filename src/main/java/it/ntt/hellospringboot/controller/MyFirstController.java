package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyFirstController {
    
    @RequestMapping("/hello")
    public String helloWorld () {
        return "Hello World! This is my COntroller";
    }
}
