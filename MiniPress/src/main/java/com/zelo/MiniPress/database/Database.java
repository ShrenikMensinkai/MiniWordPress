/**
 * 
 */
package com.zelo.MiniPress.database;

import java.util.ArrayList;

import com.zelo.MiniPress.module.Article;
import com.zelo.MiniPress.module.Category;
import com.zelo.MiniPress.module.User;

/**
 * @author shren
 *
 */
public class Database 
{
	public static ArrayList<User> users = new ArrayList<User>();

	public static ArrayList<Article> articles = new ArrayList<Article>();
	
	public static ArrayList<Category> categories = new ArrayList<Category>();
	
	
	public static ArrayList<Article> getArticles()
	{
		return articles;
	}
	
	public static ArrayList<User> getUsers()
	{
		return users;
	}

	public static ArrayList<Category> getCategories()
	{
		return categories;
	}
	

	





}
