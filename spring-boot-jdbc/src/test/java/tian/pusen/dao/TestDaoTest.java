package tian.pusen.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/5 17:12
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestDaoTest {
    @Autowired
    TestDao testDao;

    @Test
    public void insertTest(){
        int id = new Random().nextInt();
        int i = testDao.insert(id);
        System.out.println("insert into test with id = "+id);
        Assert.assertTrue(i >0);
    }
}
