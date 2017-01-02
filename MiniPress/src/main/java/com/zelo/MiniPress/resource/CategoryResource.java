/**
 * 
 */
package com.zelo.MiniPress.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zelo.MiniPress.database.Database;
import com.zelo.MiniPress.module.Article;
import com.zelo.MiniPress.module.Category;
import com.zelo.MiniPress.services.CategoryService;

/**
 * @author shren
 *
 */
@Path("/category")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CategoryResource
{
	CategoryService categoryService =new CategoryService();
	@GET
	public ArrayList<Category> getAllCategory()
	{
		return categoryService.getCategories();
	}
	
	@GET
	@Path("{/categoryId}")
	public ArrayList<Article> getCategoryArticle(int categoryId)
	{
		ArrayList<Article> temp = Database.getArticles();
		ArrayList<Article> temp2 = new ArrayList<Article>();
		for (Article article : temp)
		{
			if(article.getCategoryId()==categoryId)
			{
				temp2.add(article);
			}
		}
		return temp2;
		
		
	}
}
