package com.gyl.controller;

import com.gyl.mapper.UserMapper;
import com.gyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 高云雷
 * @date 2021-04-2021/4/1 14:24:52
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/hello")
    public String index(Model model){
        return  "Hello World";
    }

    @RequestMapping("/excep")
    public String excep(Model model){
        int a = 2/0;
        return  "Hello Exception";
    }

    @GetMapping("getuser")
    public Object getUser(Integer id){
        return userMapper.getUserById(id);
    }

    @PostMapping("/insert")
    public Object insert(String username,String sex){
        return userMapper.insert(username,sex);
    }

    @RequestMapping("trans")
    public String trans(){
        userService.tranfor();
        return "success";
    }
}

