package cn.iocyho.controller.impl;

import cn.iocyho.controller.UserController;
import cn.iocyho.domain.User;
import cn.iocyho.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 15:23
 * @Version V1.0
 **/
@Controller

@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    @GetMapping("/list")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    @GetMapping("/get/{id}")
    @ResponseBody
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @Override
    @PutMapping("/add")
    public void update(@RequestBody  User user) {
        userService.saveUser(user);
    }

    @Override
    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }
}
