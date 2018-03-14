package tian.pusen.domain;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import tian.pusen.mybatis.entity.Test;
import tian.pusen.mybatis.mapper.TestMapper;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/6 14:22
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapperTest {
    @Autowired
    TestMapper testMapper;
    @org.junit.Test
    public void selectTest() {
        long l = System.currentTimeMillis();
        Test t= new Test();
        t.setId(l);
        t.setGmtCreate(new Date());
        t.setGmtModified(new Date());
        int i = testMapper.insert(t);
        System.out.println("insert result:"+i);
        Test test = testMapper.selectById(l);
        System.out.println(test);

    }
    @org.junit.Test
    public void insertTest() {

    }
}
