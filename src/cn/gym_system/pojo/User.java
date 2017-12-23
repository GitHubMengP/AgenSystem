package cn.gym_system.pojo;

import java.sql.Timestamp;

/**
 * 用户类
 * @author MengPeng
 *
 */
public class User {
	private Integer id;    //主键ID
	private String userName; //用户姓名
	private String cardNo;	 //卡号
	private String password; //密码
	private String identityNumber; //身份证号
	private double rechargeMoney; //充值金额
	private Timestamp rechargeDate; //充值时间 
	private Integer memberRank; //会员类型
	private double balance; //余额
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public double getRechargeMoney() {
		return rechargeMoney;
	}
	public void setRechargeMoney(double rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}
	public Timestamp getRechargeDate() {
		return rechargeDate;
	}
	public void setRechargeDate(Timestamp rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	public Integer getMemberRank() {
		return memberRank;
	}
	public void setMemberRank(Integer memberRank) {
		this.memberRank = memberRank;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
