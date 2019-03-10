package cn.iocyho.controller.impl;

import cn.iocyho.controller.PageController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program practices
 * @Description redirect to the welcome page
 * @Author cyh
 * @Date 2019/3/5 21:25
 * @Version V1.0
 **/
@Controller
public class PageControllerImpl implements PageController{
    @GetMapping("/")
    @Override
    public String welcome(){
        return "index";
    }

    @GetMapping("/user")
    @Override
    public String userManagePage(){
        return "user";
    }
}
