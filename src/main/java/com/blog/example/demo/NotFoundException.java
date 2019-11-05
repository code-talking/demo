package com.blog.example.demo;

import org.aspectj.weaver.ast.Not;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * User:   bl
 * Date:   2019-11-05
 * Time:   09:36
 * Package com.blog.example.demo
 * File    NotFoundException
 * Description
 */

@ResponseStatus(HttpStatus.NOT_FOUND)               //  定义http的返回状态码
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
