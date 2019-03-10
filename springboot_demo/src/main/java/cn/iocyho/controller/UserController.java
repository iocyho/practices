package cn.iocyho.controller;

import cn.iocyho.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 15:23
 * @Version V1.0
 **/
@Api(value="用户管理接口",description = "用户管理接口，提供用户的增删改查功能")
public interface UserController {
    @ApiOperation("获取用户信息列表")
    List<User> findAll();

    @ApiOperation("根据用户id获取用户信息")
    User findById(Integer id);

    @ApiOperation("修改/新增用户信息")
    void update(User user);

    @ApiOperation("根据用户id删除用户")
    void delete(Integer id);
}
