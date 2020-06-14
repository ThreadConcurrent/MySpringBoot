package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangCheng
 * @describe
 * @create 2020-06-13 16:49
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/get/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        return "success"+id;
    }

}
