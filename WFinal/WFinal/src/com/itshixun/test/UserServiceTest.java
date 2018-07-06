package com.itshixun.test;

import junit.framework.Assert;

import org.junit.Test;

import com.itshixun.model.User;
import com.itshixun.service.UserService;
import com.itshixun.service.impl.UserServiceImpl;


public class UserServiceTest {
/**
 *   此方法为测试系统登录操作根据用户名和密码和权限成功登陆
 */
	@Test
   public void testLoginSuccess(){
	   System.out.println("test Login method");
	   UserService  userService = new UserServiceImpl();
	   User user= new User();
	   user.setUserName("A");
	   user.setUserPwd("a123");
	   user.setTypeNo(1);
	   User flag=userService.login(user);
	   Assert.assertEquals(user.getUserName(),flag.getUserName());
   }
}
