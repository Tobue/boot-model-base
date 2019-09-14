package com.sx.dataaccess.mapper.user;




import com.sx.dataaccess.entiry.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author xieshiguo
 * @date 2018/6/3/003 16:05
 */
@Mapper
public interface UserMapper {
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
     * 查看所有用户
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
