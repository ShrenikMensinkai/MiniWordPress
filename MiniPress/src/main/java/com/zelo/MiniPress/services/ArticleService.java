/**
 * 
 */
package com.zelo.MiniPress.services;

import java.util.ArrayList;

import com.zelo.MiniPress.database.Database;
import com.zelo.MiniPress.module.Article;

/**
 * @author shren
 *
 */
public class ArticleService
{

	ArrayList<Article> article = Database.getArticles();
	
	/**
	   * @method getArticle
	   * @return ArrayList<Article> 
	   * @param void
	*/
	public ArrayList<Article> getArticle()
	{	
		return Database.getArticles();
	}
	
	/**
	   * @method addArticle
	   * @return Article 
	   * @param Article
	*/
	public Article addArticle(Article newarticle)
	{
		newarticle.setId(article.size());
		article.add(newarticle);
		return newarticle;
	}
	
	/**
	   * @method getArticle
	   * @return ArrayList<Article> 
	   * @param int
	*/
	public ArrayList<Article> getArticle(int userId)
	{
		ArrayList<Article> temp1 = new ArrayList<Article>();
		ArrayList<Article> temp = Database.getArticles();
		for (Article article : temp)
		{
			if(article.getUserId()==userId)
			{
				temp1.add(article);
			}
		}
		return temp1;
	}
	
	/**
	   * @method modifyArticleCategory
	   * @return Article 
	   * @param int
	   * * @param int
	*/
	public Article modifyArticleCategory(int articleId,int categoryId)
	{
		ArrayList<Article> temp1 = Database.getArticles();
		for(int i=0;i<temp1.size();i++)
		{
			if(temp1.get(i).getId()==articleId)
			{
				temp1.get(i).setCategoryId(categoryId);
				return temp1.get(i);
			}
		}
		return null;
	}
	
	/**
	   * @method deleteArticle
	   * @return boolean 
	   * @param int
	*/
	public boolean deleteArticle(int articleId)
	{
		ArrayList<Article> temp1= Database.getArticles();
		for(int i=0;i<temp1.size();i++)
		{
			if(temp1.get(i).getId()==articleId)
			{
				temp1.remove(i);
				return true;
			}
		}
		return false;
	}
	
}
