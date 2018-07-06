package com.itshixun.service;

import java.util.Vector;

import javax.swing.JTable;

import com.itshixun.model.StaffTransfer;

 

public interface StaffTransferService {
 /**
  * 找出所有员工调动记录
  * @return 所有员工调动记录的集合
  */
 public void findStaffTransfer(JTable jtable1);
 /**
  *  删除特定的员工调动记录
  * @param transferNo 员工调动记录的编号
  */
 public void delStaffTransfer(int transferNo);

 /**
  * 添加员工调动记录的方法
  * @param staffTransfer 员工调动记录对象
  */
 public void addStaffTransfer(StaffTransfer staffTransfer);
 /**
  * 找出特定的员工调动记录
  * @return 特定员工调动记录的集合
  */
// public Vector findAStaffTransfer(int transferNo,JTable jTable1);
 public void findAStaffTransfer(int transferNo,JTable jTable1);
 /**
  * 员工调动记录的更改
  * @param staffTransfer
  */
 public void UpdateStaffTransfer(StaffTransfer staffTransfer);


}
