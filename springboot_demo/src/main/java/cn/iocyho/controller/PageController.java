package cn.iocyho.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 17:36
 * @Version V1.0
 **/
@Api(value="页面跳转接口",description = "用于跳转页面")
public interface PageController {
    @ApiOperation("跳转至主页")
    String welcome();

    @ApiOperation("跳转至用户管理页面")
    String userManagePage();
}
