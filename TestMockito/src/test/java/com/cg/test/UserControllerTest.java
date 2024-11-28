package com.cg.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.UserService;

import com.cg.UserController;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {
	@Mock
	private UserService userService;
	
	@InjectMocks
	private UserController userController;
	
	@Test
	void testGetUser() {
		int userId = 1;
	   when(userService.getUserById(userId)).thenReturn("User1");
		
		String result = userController.getUser(userId);
		
		assertEquals("User1", result);
	}

}
