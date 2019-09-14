package com.sx.controller;


import com.sx.dataaccess.entiry.user.User;
import com.sx.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author xieshiguo
 * @date 2018/6/3/003 16:19
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ApiOperation("添加用户")
    @ResponseBody
    public int insert(@RequestBody User user){
        System.out.println("fdf");
        System.out.println();
        System.out.println("好的");
        return userService.insert(user);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation("编辑用户")
    @ResponseBody
    public int update(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping(value = "findById",method = RequestMethod.GET)
    @ApiOperation("根据id查询用户")
    @ResponseBody
    public User findById(int id){
        return userService.findById(id);
    }


    @RequestMapping(value = "findAllUser",method = RequestMethod.GET)
    @ApiOperation("查询所有用户")
    @ResponseBody
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ApiOperation("删除用户")
    @ResponseBody
    public int delete(int id){
        return userService.delete(id);
    }

}
