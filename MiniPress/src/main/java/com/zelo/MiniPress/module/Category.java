/**
 * 
 */
package com.zelo.MiniPress.module;

import java.util.Date;

/**
 * @author shren
 *
 */
public class Category 
{
	private int id;
	private String name;
	private Date created;
	
	public Category()
	{
		
	}
	public Category(int Id,String Name)
	{
		id=Id;
		name = Name;
		created = new Date();	
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
}
