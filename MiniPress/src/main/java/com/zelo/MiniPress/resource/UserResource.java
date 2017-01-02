/**
 * 
 */
package com.zelo.MiniPress.resource;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zelo.MiniPress.module.User;
import com.zelo.MiniPress.services.UserService;

/**
 * @author shren
 *
 */
@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UserResource
{
	UserService userService = new UserService();
	
	@GET
	public ArrayList<User> getUsers()
	{
		return userService.getUser();
	}
	
	@GET
	@Path("/{userId}")
	public User getUsers(@PathParam("userId") int userId)
	{
		ArrayList<User> temp = userService.getUser();
		
		for (User user : temp)
		{
			if(user.getId()==userId)
			{
				return user;
			}
		}
		return null;
	
	}
	@POST
	public User addUser(User user)
	{
		return userService.addUser(user);
	}



}
