package Main.enity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description 博客类型实体
 * @author Du zhongshu
 *
 */

@Entity
@Table(name = "blogtype")
public class BlogType {
	public BlogType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BlogType(Integer id, String typeName, String orderNum,
			Integer blogCount) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.orderNum = orderNum;
		this.blogCount = blogCount;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String typeName;
	private String orderNum;
	
	private Integer blogCount; //统计不同类型的博客数量的
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Integer getBlogCount() {
		return blogCount;
	}
	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
	
}
