package cn.iocyho.service;

import cn.iocyho.domain.User;

import java.util.List;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/5 21:42
 * @Version V1.0
 **/
public interface UserService {
    List<User> findAll();

    User findById(String id);

    void update(User user);

    void delete(String id);
}
