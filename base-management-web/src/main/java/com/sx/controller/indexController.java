package com.sx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiesguo
 * @Date: 2019/9/13/013 16:22
 */
@RestController
public class indexController {

    @RequestMapping(value = "/web",method = RequestMethod.GET)
    public String test(){
        return "web你好";
    }

}
