package com.blog.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User:   bl
 * Date:   2019-11-04
 * Time:   20:19
 * Package com.blog.example.demo
 * File    HelloController
 * Description
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(){
        String msg = "hello world!";
        return msg;
    }

    @RequestMapping("/blog")
    public String blog() {
        String msg = "develop blog";
        return msg;
    }

    @RequestMapping("/users")
    public String user() {
        String msg = "users";
        return msg;
    }
}
