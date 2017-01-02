package com.zelo.MiniPress.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zelo.MiniPress.module.Article;
import com.zelo.MiniPress.services.ArticleService;

@Path("/article")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticleResource 
{
	public ArticleService articleService = new ArticleService();

	@GET
	public ArrayList<Article> getArticles()
	{
		return articleService.getArticle();
	}
	
	@POST
	public Article addArticle(Article article)
	{
		articleService.addArticle(article);
		return article;
	}
	
	@GET
	@Path("/{userId}")
	public ArrayList<Article> getArticles(@PathParam("userId") int userId)
	{	
		return articleService.getArticle(userId);
	}
	
	@PUT
	@Path("/{articleId}")
	public Article modifyArticleCategory(@PathParam("articleId") int articleId, Article article)
	{
		int categoryId = article.getCategoryId();
		return articleService.modifyArticleCategory(articleId, categoryId);
	}
	
	@DELETE
	@Path("/{articleId}")
	public void deleteArticle(@PathParam("articleId") int articleId)
	{
		articleService.deleteArticle(articleId);
	}
	

}
