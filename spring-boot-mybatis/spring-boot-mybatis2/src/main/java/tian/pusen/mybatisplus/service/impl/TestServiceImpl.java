package tian.pusen.mybatisplus.service.impl;

import tian.pusen.mybatisplus.entity.Test;
import tian.pusen.mybatisplus.mapper.TestMapper;
import tian.pusen.mybatisplus.service.ITestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目健康检查表（DevOps需要，勿删） 服务实现类
 * </p>
 *
 * @author 田圃森
 * @since 2018-03-06
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {
	
}
