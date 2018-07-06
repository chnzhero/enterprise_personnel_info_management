package com.itshixun.model;

public class UserType {

 private String typeName;
 private int typeNo;
public String getTypeName() {
	return typeName;
}
public void setTypeName(String typeName) {
	this.typeName = typeName;
}
public int getTypeNo() {
	return typeNo;
}
public void setTypeNo(int typeNo) {
	this.typeNo = typeNo;
}
public UserType(int typeNo,String typeName) {
	super();
	this.typeName = typeName;
	this.typeNo = typeNo;
}
public UserType() {
	super();
}

}

