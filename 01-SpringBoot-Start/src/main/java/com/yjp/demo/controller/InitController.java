package com.yjp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: indexController
 * @Description: TODO
 * @author: v_jpyin
 * @date: 2020/6/5
 */
@RestController
public class InitController {

    @GetMapping("/")
    public String init(){
        return "Hello World";
    }
}
