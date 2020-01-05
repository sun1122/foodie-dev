package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author flysun55
 * @date 2019/12/28
 */
@ApiIgnore
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object Hello(){
        return "Hello World";
    }
}
