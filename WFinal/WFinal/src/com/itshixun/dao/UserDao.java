package com.itshixun.dao;

import java.util.Vector;

import com.itshixun.model.User;


public interface UserDao {
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
 public Vector findAllUser();
 
 /**
  * 此方法用于根据编号查询用户
  * @param user_no
  * @return 一个用户的集合
  */
 public Vector findAUser(String userName);

 /**
  * 此方法用于更新用户对象信息
  * @return 一个修改过后的对象
  */
 public User UpdateUser(User user);
 /**
  * 此方法用于添加一个用户对象
  * @param 需要添加的用户对象user
  * @return 添加的用户对象
  */
 public User AddUser(User user);
 
 /**
  * 此方法用于删除一个用户对象
  * @param userName 删除的对象名
  * @return
  */
 public void DelUser(String userName);
 
}
