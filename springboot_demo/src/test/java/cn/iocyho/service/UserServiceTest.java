package cn.iocyho.service;

import cn.iocyho.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 15:51
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testFindAll(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindById(){
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUsername("测试数据");
        user.setPassword("123");
        user.setSex("male");
        user.setAge(15);
        userService.saveUser(user);
    }

    @Test
    public void testDeleteById(){
        userService.deleteById(6);
    }
}
