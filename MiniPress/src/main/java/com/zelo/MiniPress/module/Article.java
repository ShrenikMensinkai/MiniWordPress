/**
 * 
 */
package com.zelo.MiniPress.module;

import java.util.Date;

/**
 * @author shren
 *
 */
public class Article
{

	private int id;
	private int userId;
	private String title;
	private Date created= new Date();
	private String author;
	private int categoryId;
	
	public Article()
	{
		
	}
	
	public Article(int Id,int UserId,String Title,String Author,int CategoryId)
	{
		id= Id;
		userId=UserId;
		title=Title;
		author=Author;
		categoryId=CategoryId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Date getCreated() {
		return created;
	}

	
}
