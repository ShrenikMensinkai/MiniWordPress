/**
 * 
 */
package com.zelo.MiniPress.services;

import java.util.ArrayList;

import com.zelo.MiniPress.database.Database;
import com.zelo.MiniPress.module.Category;

/**
 * @author shren
 *
 */
public class CategoryService 
{
	public ArrayList<Category> category = Database.getCategories();
	
	/**
	   * @method getCategories
	   * @return ArrayList<Category> 
	   * @param void
	*/
	public ArrayList<Category> getCategories()
	{
			return category;
	}
	
	/**
	   * @method addCategory
	   * @return Category 
	   * @param Category
	*/
	public Category addCategory(Category newCategory)
	{
		category.add(newCategory);
		return newCategory;
	}



}
