package tian.pusen.web.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tian.pusen.mybatisplus.entity.User;
import tian.pusen.mybatisplus.service.IUserService;


/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/21 9:11
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
    @Autowired
    IUserService userService;

    @Test
    public void selectByNameTest() {
        String name = "tps";
        User user  = userService.selectByName(name);
        Assert.assertTrue(user!= null && name.equals(user.getUsername()));

    }
}
