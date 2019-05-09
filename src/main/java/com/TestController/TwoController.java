package com.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
    @RequestMapping("/TEO")
    public String two() {
        return "HHA";
    }
}
