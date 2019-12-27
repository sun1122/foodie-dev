package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author flysun55
 * @date 2019/12/28
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object Hello(){
        return "Hello World";
    }
}
