package cn.gym_system.pojo;

import java.sql.Timestamp;

/**
 * ���ű�
 * @author MengPeng
 *
 */
public class News {
	private Integer id; //����ID
	private String title; //����
	private String author; //����
	private String content;//��������
	private Timestamp createDate; //����ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	
}
