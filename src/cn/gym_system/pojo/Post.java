package cn.gym_system.pojo;
/**
 * 职务类
 * @author MengPeng
 *
 */
public class Post {
	private Integer id; //主键ID
	private String postName; //职务名称
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	
}
