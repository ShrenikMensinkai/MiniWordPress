/**
 * 
 */
package com.zelo.MiniPress.services;

import java.util.ArrayList;

import com.zelo.MiniPress.database.Database;
import com.zelo.MiniPress.module.User;

/**
 * @author shren
 *
 */
public class UserService
{

	
	ArrayList<User> users = Database.getUsers();
	
	/**
	   * @method addUser
	   * @return User 
	   * @param User
	*/
	public User addUser(User user)
	{	
		user.setId(users.size()+1);
		users.add(user);
		return user;
	}
	
	/**
	   * @method getUser
	   * @return ArrayList<User> 
	   * @param void
	*/
	public ArrayList<User> getUser()
	{
		return Database.getUsers();
	}
	
	/**
	   * @method removeUser
	   * @return Boolean 
	   * @param int
	*/
	public Boolean removeUser(int userId)
	{
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getId()==userId)
			{
				users.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
}
