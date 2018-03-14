package tian.pusen.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tian.pusen.mybatisplus.entity.Test;
import tian.pusen.mybatisplus.service.ITestService;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/14 11:39
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@RestController
public class TestController {
    @Autowired
    ITestService testService;

    @GetMapping("/count")
    public String getCount() {
        EntityWrapper<Test> ew = new EntityWrapper<>();
        int i= testService.selectCount(ew);
        return ""+i;
    }
}
