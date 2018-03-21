package tian.pusen.mybatisplus.service;

import tian.pusen.mybatisplus.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 项目健康检查表（DevOps需要，勿删） 服务类
 * </p>
 *
 * @author 田圃森
 * @since 2018-03-20
 */
public interface IUserService extends IService<User> {
    User selectByName(final String name);
}
