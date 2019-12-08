package practice.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author yanyuchi
 * @date 2019-12-08 19:28
 */
@Data
public class User {


    private Integer id;

    private String username;

    private String email;

    public User(Integer id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }
}
