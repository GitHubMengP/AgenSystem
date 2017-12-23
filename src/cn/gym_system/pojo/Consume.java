package cn.gym_system.pojo;

import java.sql.Timestamp;

/**
 * 消费记录类
 * @author MengPeng
 *
 */
public class Consume {
	private Integer id;	//主键ID
	private Integer userId; //用户ID
	private Integer adminId;//管理员ID
	private Timestamp consumeDate; //消费时间
	private double consumeMoney;   //消费金额
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public Timestamp getConsumeDate() {
		return consumeDate;
	}
	public void setConsumeDate(Timestamp consumeDate) {
		this.consumeDate = consumeDate;
	}
	public double getConsumeMoney() {
		return consumeMoney;
	}
	public void setConsumeMoney(double consumeMoney) {
		this.consumeMoney = consumeMoney;
	}
	
}
