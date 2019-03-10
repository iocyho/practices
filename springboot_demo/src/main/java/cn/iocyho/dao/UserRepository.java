package cn.iocyho.dao;

import cn.iocyho.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

/**
 * @Program practices
 * @Description TODO
 * @Author cyh
 * @Date 2019/3/10 15:25
 * @Version V1.0
 **/
public interface UserRepository extends JpaRepository<User,Integer> {
}
