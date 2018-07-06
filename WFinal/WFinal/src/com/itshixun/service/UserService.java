package com.itshixun.service;

import java.util.Vector;

import javax.swing.JTable;

import com.itshixun.model.User;

 
public interface UserService {
	/**
	 * enter  此方法为系统登录操作根据用户名和密码
	 * @param user
	 * @return  一个有效的用户对象
	 */
 public  User  login(User user);
 /**
  * 此方法用于找出所有的用户对象
  * @return 一个Vector集合
  */
 public void findAllUser(JTable jTable);
 
 /**
  * 此方法用于根据编号查询用户
  * @param user_no
  * @return 一个用户的集合
  */
 public void findAUser(String user_name,JTable jTable);
 
 /**
  * 此方法用于更新用户对象信息
  * @return 一个修改过后的对象
  */
 public User UpdateUser(User user);
 /**
  * 此方法用于添加一个用户对象
  * @param user
  * @return 添加的用户对象
  */
 public User AddUser(User user);

 
 /**
  * 此方法用于删除一个用户对象
  * @param user
  * @return
  */
 public void DelUser(String UserName);

}
