package tian.pusen.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/6 10:51
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface TestRepository extends JpaRepository<Test, Long> {
//    // 继承一些共用方法
//    @Query("from test t where t.id =:id")
//    List<Test> findBefore(Long id);
}
