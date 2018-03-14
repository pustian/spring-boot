package tian.pusen.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 * Date: 2018/3/6 10:48
 *
 * @author tianpusen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Entity
public class Test {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Date gmt_create;

    @Column(nullable = false)
    private Date gmt_modified;

    public Test() {
    }

    public Test(Long id, Date gmt_create, Date gmt_modified) {
        this.id = id;
        this.gmt_create = gmt_create;
        this.gmt_modified = gmt_modified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}
