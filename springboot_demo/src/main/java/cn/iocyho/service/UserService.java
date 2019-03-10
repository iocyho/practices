package cn.iocyho.service;

import cn.iocyho.dao.UserRepository;
import cn.iocyho.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 15:24
 * @Version V1.0
 **/
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Integer id){
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }
}
