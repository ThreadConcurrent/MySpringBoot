package com.atguigu.springboot.controller;

import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangCheng
 * @describe
 * @create 2020-06-13 16:28
 */
@RequestMapping("/book")
@RestController
public class BookController {

    @RequestMapping("/get/{id}")
    public String getBookById(@PathVariable("id") String id){
        return "success" + id;
    }

}
