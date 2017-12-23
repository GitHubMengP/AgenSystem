package cn.gym_system.pojo;

import java.sql.Timestamp;

/**
 * 新闻表
 * @author MengPeng
 *
 */
public class News {
	private Integer id; //主键ID
	private String title; //标题
	private String author; //作者
	private String content;//新闻内容
	private Timestamp createDate; //创建时间
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
