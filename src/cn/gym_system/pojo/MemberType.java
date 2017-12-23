package cn.gym_system.pojo;
/**
 * 会员类别
 * @author MengPeng
 *
 */
public class MemberType {
	private Integer id;	//主键ID
	private String menberName; //类别名称
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenberName() {
		return menberName;
	}
	public void setMenberName(String menberName) {
		this.menberName = menberName;
	}
	
}
