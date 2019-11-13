package com.sx.service.user.Impl;


import com.sx.common.result.ErrorCode;
import com.sx.common.result.ServiceResult;
import com.sx.dataaccess.entiry.user.User;
import com.sx.dataaccess.mapper.user.UserMapper;
import com.sx.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xieshiguo
 * @date 2018/6/3/003 16:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        user.setCreateTime(new Date());
        String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(password);
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        if (user.getId() == null) {
            throw new RuntimeException("用户id不能为空");
        }
        String password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        user.setPassword(password);
        return userMapper.update(user);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public ServiceResult<String, List<User>> queryList() {
        ServiceResult<String, List<User>> result = new ServiceResult<>();
        List<User> allUser = userMapper.findAllUser();
        result.setErrorCode(ErrorCode.SUCCESS);
        result.setResult(allUser);
        return result;
    }


    public static void main(String[] args) {
        User user = null;
        List<Integer> list = new ArrayList<>();

//        Assert.notNull(user, "对象为空"); //对象非空

        Assert.isTrue(false, "object must be true");// 对象必须为true

//        Assert.notEmpty(list, "collection must not be empty");//集合非空




       /* Assert.hasLength(String text, "text must be specified");// 字符不为null且字符长度不为0

        Assert.hasText(String text, "text must not be empty");// 不为null且必须至少包含一个非空格的字符

        Assert.isInstanceOf(Class clazz, Object obj, "clazz must be of type [clazz]");//  obj必须能被正确造型成为clazz 指定的类*/

    }
}
