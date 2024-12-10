package com.umesh.demoWeb;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @RequestMapping("/")
    public String Home(){
        return "Home page";
    }
}
