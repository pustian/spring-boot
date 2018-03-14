package tian.pusen.domain;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/6 10:57
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestRepositoryTest {
    @Autowired
    TestRepository testRepository;
    @Test
    public void tetest() {
        // 新建
        testRepository.save(new tian.pusen.domain.Test(100L, new Date(), new Date()));
        testRepository.save(new tian.pusen.domain.Test(101L, new Date(), new Date()));
        testRepository.save(new tian.pusen.domain.Test(102L, new Date(), new Date()));
        // 测试findAll, 查询所有记录
        int size = testRepository.findAll().size();
        System.out.println("size:"+size);
//        //
//        testRepository.deleteById(100L);
//        List<tian.pusen.domain.Test> testList = testRepository.findBefore(100L);
//        System.out.println("size 2:" + testList.size());
    }
}
