package tian.pusen.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tian.pusen.dao.TestDao;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/5 16:51
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Repository("testDao")
public class TestDaoImpl implements TestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(int id) {
        String insertSQL = "insert into test(id, gmt_modified, gmt_create) values(?, now(), now())";
        return jdbcTemplate.update(insertSQL, id);
    }

    @Override
    public int update(int id) {
        String updateSQL = "update test set gmt_modified = now() where id = ?";
        return jdbcTemplate.update(updateSQL, id);
    }

    @Override
    public int delete(int id) {
        String deleteSQL = "delete from test where id = ?";
        return jdbcTemplate.update(deleteSQL, id);
    }

    @Override
    public int count() {
        String countSQL = "select count(1) from test";
        return jdbcTemplate.queryForObject(countSQL, int.class);
    }

    @Override
    public int deleteAll() {
        String deleteSQL = "truncate table test";
        return jdbcTemplate.update(deleteSQL);
    }

//    SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(SQL);
}
