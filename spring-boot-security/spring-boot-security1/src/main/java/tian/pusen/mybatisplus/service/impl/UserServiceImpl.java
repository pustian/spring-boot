package tian.pusen.mybatisplus.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import tian.pusen.mybatisplus.entity.User;
import tian.pusen.mybatisplus.mapper.UserMapper;
import tian.pusen.mybatisplus.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目健康检查表（DevOps需要，勿删） 服务实现类
 * </p>
 *
 * @author 田圃森
 * @since 2018-03-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User selectByName(String name) {
        User clause = new User();
        clause.setUsername(name);
        EntityWrapper<User> ew = new EntityWrapper<>(clause);
        return selectOne(ew);
    }
}
