package tian.pusen.domain;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

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
        int i = testMapper.insert(l, new Date(), new Date());
        System.out.println("insert result:"+i);
        Test test = testMapper.selectById(l);
        System.out.println(test);
    }
    @org.junit.Test
    public void insertTest() {
        long l = System.currentTimeMillis();
        Test test = new Test();
        test.setId(l);
        test.setGmtCreate(new Date());
        test.setGmtModified(new Date());
        int i = testMapper.insertTest(test);
        System.out.println("insertTest result:"+i);
        Test test2 = testMapper.selectById(l);
        System.out.println(test2);
    }
    @org.junit.Test
    public void insertTest0() {
        long l = System.currentTimeMillis();
        Test test = new Test();
        test.setId(l);
        test.setGmtCreate(new Date());
        test.setGmtModified(new Date());
        int i = testMapper.insertTest0(test);
        System.out.println("insertTest result:"+i);
        Test test2 = testMapper.selectById(l);
        System.out.println(test2);
    }
}
