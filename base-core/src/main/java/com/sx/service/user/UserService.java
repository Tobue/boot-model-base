package com.sx.service.user;


import com.sx.dataaccess.entiry.user.User;

import java.util.List;

/**
 * @author xieshiguo
 * @date 2018/6/3/003 16:15
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 编辑用户
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 查看用户
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 获取所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(int id);
}
