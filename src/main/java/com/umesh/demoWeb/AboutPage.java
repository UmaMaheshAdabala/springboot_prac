package com.umesh.demoWeb;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutPage {
    @RequestMapping("/about")
    public String About(){
        return "About Page";
    }
}
