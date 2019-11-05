package com.blog.example.demo.web;

import com.blog.example.demo.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * User:   bl
 * Date:   2019-11-05
 * Time:   09:05
 * Package com.blog.example.demo.web
 * File    IndexController
 * Description
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i = 9 / 0;

        String blog = null;
        if (blog == null) {
            throw new NotFoundException("博客不存在");
        }

        return "index";
    }
}
