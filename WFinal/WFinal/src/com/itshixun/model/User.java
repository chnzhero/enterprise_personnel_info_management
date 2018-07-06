package com.itshixun.model;

public class User {
private int userNo;
private String userName;
private String userPwd;
private int typeNo;
public int getUserNo() {
	return userNo;
}
public void setUserNo(int userNo) {
	this.userNo = userNo;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
public int getTypeNo() {
	return typeNo;
}
public void setTypeNo(int typeNo) {
	this.typeNo = typeNo;
}
public User(String userName, String userPwd, int typeNo) {

	this.userName = userName;
	this.userPwd = userPwd;
	this.typeNo = typeNo;
}
public User(){
	
}

}
