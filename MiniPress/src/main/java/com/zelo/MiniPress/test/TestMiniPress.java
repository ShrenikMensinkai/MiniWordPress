package com.zelo.MiniPress.test;

import com.zelo.MiniPress.database.Database;
import com.zelo.MiniPress.module.*;
import com.zelo.MiniPress.services.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMiniPress {

	@Test
	public void test01() 
	{	
		//Testing addUser function from the userService class
		UserService userService = new UserService();
		User user = new User("shrenikmensinkai","abc","Shrenik","Mensinkai");
		assertEquals(user, userService.addUser(user));
	}
	
	@Test
	public void test02()
	{
		//Testing getUser function from the userService class
		UserService userService = new UserService();
		User user1 = new User("shrenikmensinkia","abc","Shrenik","Mensinkai");
		User user2 = new User("avinashmensinkia","def","Avinash","Mensinkai");
		User user3 = new User("rashmimensinkia","ijk","Rashmi","Mensinkai");
		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);
		ArrayList<User> user = Database.getUsers();
		
		assertEquals(user, userService.getUser());
		
	}
	
	@Test
	public void test03()
	{
		//Testing removeUser function from the userService class
		UserService userService = new UserService();
		User user1 = new User("shrenikmensinkia","abc","Shrenik","Mensinkai");
		User user2 = new User("avinashmensinkia","def","Avinash","Mensinkai");
		User user3 = new User("rashmimensinkia","ijk","Rashmi","Mensinkai");
		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);
		
		assertTrue(userService.removeUser(2));
	}
	
	@Test
	public void test04()
	{
		//Testing getCategory function from the categoryService class
		CategoryService categoryService = new CategoryService();
		Category category1 = new Category(1,"Science and Technology");
		Category category2 = new Category(2,"Business and Finance");
		Category category3 = new Category(3,"Food and Entertainment");
		categoryService.addCategory(category1);
		categoryService.addCategory(category2);
		categoryService.addCategory(category3);
		
		ArrayList<Category> category = Database.getCategories();
		
		assertEquals(category, categoryService.getCategories());
	}
	
	@Test
	public void test05()
	{
		//Testing addCategory function from the categoryService class
		CategoryService categoryService = new CategoryService();
		Category category = new Category(1,"Science and Technology");
		
		assertEquals(category, categoryService.addCategory(category));
	}
	
	
	@Test
	public void test06()
	{
		//Testing addArtical function from the ArticalService class
		ArticleService articleService = new ArticleService();
		Article artical1 = new Article(1,1,"Create an Investment Plan","Shrenik",2);
	
		assertEquals(artical1, articleService.addArticle(artical1));
	}
	
	
	
	@Test
	public void test07x()
	{
		//Testing get Specific Artical function from the ArticalService class
		ArticleService articleService = new ArticleService();
		Article article1= new Article(1,1,"Create an Investment Plan","Shrenik",2);
		Article article2 = new Article(3,1,"Make a finance chart in numbers","Shrenik",2);
		
		articleService.addArticle(article1);
		articleService.addArticle(article2);
		
		ArrayList<Article> temp = new ArrayList<Article>();
		temp.add(article1);
		temp.add(article2);
		assertTrue(temp.equals(articleService.getArticle(1)));
	
	}
	
	
	@Test
	public void test08()
	{
		//Testing addArtical function from the ArticalService class
		ArticleService articleService = new ArticleService();
		
		Article artical1 = new Article(1,1,"Create an Investment Plan","Shrenik",2);
		Article artical2 = new Article(2,2,"Buy used Electronics","Avinash",1);
		Article artical3 = new Article(3,1,"Make a finance chart in numbers","Shrenik",2);
		Article artical4 = new Article(4,3,"Cook Romantic Meals","Rashmi",3);
		articleService.addArticle(artical1);
		articleService.addArticle(artical2);
		articleService.addArticle(artical3);
		articleService.addArticle(artical4);
		
		ArrayList<Article> article = Database.getArticles();
		
		assertEquals(article, articleService.getArticle());
	
	
	}
	
	@Test
	public void test09()
	{
		//Testing modifyArtical function from the ArticalService class
		ArticleService articleService = new ArticleService();
		
		Article article1 = new Article(1,1,"Create an Investment Plan","Shrenik",2);
		Article article2 = new Article(2,2,"Buy used Electronics","Avinash",1);
		Article article3 = new Article(3,1,"Make a finance chart in numbers","Shrenik",2);
		Article article4 = new Article(4,3,"Cook Romantic Meals","Rashmi",3);
		
		Article article5 = new Article(1,2,"Buy used Electronics","Avinash",5);
		
		articleService.addArticle(article1);
		articleService.addArticle(article2);
		articleService.addArticle(article3);
		articleService.addArticle(article4);
		articleService.modifyArticleCategory(1,5);
		ArrayList<Article> article = Database.getArticles();
		
		
		assertTrue((article5.getCategoryId())==(article.get(1).getCategoryId()));
	
	}
	
	
	@Test
	public void test10()
	{
		//Testing deleteArtical function from the ArticalService class
		ArticleService articleService1 = new ArticleService();
		
		Article article1 = new Article(1,1,"Create an Investment Plan","Shrenik",2);
		Article article2 = new Article(2,2,"Buy used Electronics","Avinash",1);
		Article article3 = new Article(3,1,"Make a finance chart in numbers","Shrenik",2);
		Article article4 = new Article(4,3,"Cook Romantic Meals","Rashmi",3);
		
		articleService1.addArticle(article1);
		articleService1.addArticle(article2);
		articleService1.addArticle(article3);
		articleService1.addArticle(article4);
		
		assertTrue(articleService1.deleteArticle(2));
	}
	
	

}
