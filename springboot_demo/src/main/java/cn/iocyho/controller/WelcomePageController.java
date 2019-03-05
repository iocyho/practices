package cn.iocyho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program practices
 * @Description redirect to the welcome page
 * @Author cyh
 * @Date 2019/3/5 21:25
 * @Version V1.0
 **/
@Controller
public class WelcomePageController {
    @RequestMapping("/")
    public String welcome(){
        return "index";
    }

}
