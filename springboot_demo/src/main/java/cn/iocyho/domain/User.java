package cn.iocyho.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/5 21:50
 * @Version V1.0
 **/
@Entity
@Data
@ToString
public class User {
    @ApiModelProperty("用户id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("用户性别")
    private String sex;
    @ApiModelProperty("用户年龄")
    private int age;
    @ApiModelProperty("用户邮箱")
    private String email;

}
