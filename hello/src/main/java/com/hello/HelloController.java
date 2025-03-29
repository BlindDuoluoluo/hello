package com.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    @GetMapping("/say")
    public String hello() {
        return "Hello World";
    }

    public static void main(String[] args) {

    }


}
