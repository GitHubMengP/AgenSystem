package cn.gym_system.pojo;

import java.sql.Timestamp;

/**
 * �û���
 * @author MengPeng
 *
 */
public class User {
	private Integer id;    //����ID
	private String userName; //�û�����
	private String cardNo;	 //����
	private String password; //����
	private String identityNumber; //���֤��
	private double rechargeMoney; //��ֵ���
	private Timestamp rechargeDate; //��ֵʱ�� 
	private Integer memberRank; //��Ա����
	private double balance; //���
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
