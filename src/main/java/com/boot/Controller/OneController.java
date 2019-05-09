package com.boot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {
    
    @RequestMapping("/main")
    public String main() {
        return "HELLO MY BOOT!";
    }
}
