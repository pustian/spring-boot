package tian.pusen.mybatisplus.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 项目健康检查表（DevOps需要，勿删）
 * </p>
 *
 * @author 田圃森
 * @since 2018-03-06
 */
@TableName("test")
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	private Long id;
    /**
     * 更新时间 yyyymmdd hh24miss
     */
	@TableField("gmt_modified")
	private Date gmtModified;
    /**
     * 创建时间 yyyymmdd hh24miss
     */
	@TableField("gmt_create")
	private Date gmtCreate;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
