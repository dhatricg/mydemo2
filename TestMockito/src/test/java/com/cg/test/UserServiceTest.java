package com.cg.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.UserService;
import com.cg.UserServiceimpl;

public class UserServiceTest {
	
	@Test
	
	public void testGetUserById() {
		UserService userService = new UserServiceimpl();
		int userId = 1;
		
		String result = userService.getUserById(userId);
		
		
		assertEquals("User1", result);
		
	}

}
