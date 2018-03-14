package tian.pusen.domain;

import org.apache.ibatis.annotations.*;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/6 14:14
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Mapper
public interface TestMapper {
    // 使用注释获取到的gmt_modified不准确。
    @Select("SELECT id, gmt_create, gmt_modified  FROM test WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "gmtCreate",  column = "gmt_create", javaType = Date.class),
            @Result(property = "gmtModified", column = "gmt_modified", javaType = Date.class)
    })
    Test selectById(Long id);

    @Insert("INSERT INTO test(id, gmt_create, gmt_modified) VALUES(#{id}, #{gmtCreate}, #{gmtModified})")
    int insert(@Param("id") Long id, @Param("gmtCreate") Date gmtCreate, @Param("gmtModified") Date gmtModified);

    @Insert("INSERT INTO test(id, gmt_create, gmt_modified) VALUES(#{id}, #{gmtCreate}, #{gmtModified})")
    int insertTest(Test test);

    int insertTest0(Test test);
}
