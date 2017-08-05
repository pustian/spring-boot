package tian.pusen.service.impl;

import org.springframework.stereotype.Service;
import tian.pusen.entity.User;
import tian.pusen.service.IUserService;

/**
 * Created by tianpusen on 2017/8/5.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Override
    public User selectById(String id) {
        User user = new User();
        user.setId(id);
        user.setName("田圃森");
        user.setSex("M");
        user.setBirthday("yyyyMMdd");
        user.setIdNumber("612129yyyyMMddXXXX");
        return user;
    }

    @Override
    public boolean updateById(User user) {
        return true;
    }

    @Override
    public boolean deleteById(String id) {
        return true;
    }

    @Override
    public boolean insert(User user) {
        return true;
    }
}
