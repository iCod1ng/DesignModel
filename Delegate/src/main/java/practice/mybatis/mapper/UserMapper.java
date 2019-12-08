package practice.mybatis.mapper;

import practice.mybatis.annotation.Select;
import practice.mybatis.entity.User;

public interface UserMapper {

    @Select("select id,username,email from mmall_user where id = ?")
    User getUser(int id);
}
