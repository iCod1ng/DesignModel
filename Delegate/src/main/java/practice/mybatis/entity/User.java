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

    private String password;

    private String email;

    private String phone;

    private String question;

    private String answer;

    private Integer role;

    private Date createTime;

    private Date updateTime;
}
