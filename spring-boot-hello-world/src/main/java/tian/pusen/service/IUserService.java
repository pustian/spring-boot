package tian.pusen.service;

import tian.pusen.entity.User;

/**
 * Created by tianpusen on 2017/8/5.
 */
public interface IUserService {
    User selectById(String id);
    boolean updateById(User user);
    boolean deleteById(String id);
    boolean insert(User user);
}
