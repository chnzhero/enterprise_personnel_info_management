/*
 * t_staff_leave.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itshixun.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.itshixun.model.StaffLeave;
import com.itshixun.service.StaffLeaveService;
import com.itshixun.service.impl.StaffLeaveServiceImpl;

/**
 *
 * @author  __USER__
 */
public class StaffLeaveView extends javax.swing.JInternalFrame {
	StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();

	/** Creates new form t_staff_leave */
	public StaffLeaveView() {
		initComponents();
		staffLeaveService.selectAll(jTable1);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		leftPanel = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		rightPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txRecordNo = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		txStartDate = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		txId = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		txEndDate = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txDays = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		txAllowPerson = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txReason = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		txDate = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		txSal = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		txt10 = new javax.swing.JTextField();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		result = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "请假记录号", "编号", "请假天数", "请假事由", "扣除工资",
						"开始日期", "结束日期", "批准人", "请假日期", "备注" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton4.setText("\u67e5\u8be2");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton1.setText("\u6dfb\u52a0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(
				leftPanel);
		leftPanel.setLayout(leftPanelLayout);
		leftPanelLayout
				.setHorizontalGroup(leftPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								leftPanelLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												leftPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																leftPanelLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jButton2)
																		.addComponent(
																				jButton1))
														.addComponent(jButton4))
										.addGap(1481, 1481, 1481)));
		leftPanelLayout
				.setVerticalGroup(leftPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								leftPanelLayout
										.createSequentialGroup()
										.addGap(47, 47, 47)
										.addComponent(jButton1)
										.addGap(18, 18, 18)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton4)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setText("\u8bf7\u5047\u8bb0\u5f55\u53f7");

		txRecordNo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setText("\u5f00\u59cb\u65e5\u671f");

		txStartDate.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u7f16\u53f7");

		txId.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel7.setText("\u7ed3\u675f\u65e5\u671f");

		txEndDate.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setText("\u8bf7\u5047\u5929\u6570");

		txDays.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel8.setText("\u6279\u51c6\u4eba");

		txAllowPerson.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel4.setText("\u8bf7\u5047\u4e8b\u7531");

		txReason.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel9.setText("\u8bf7\u5047\u65e5\u671f");

		txDate.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel5.setText("\u6263\u9664\u5de5\u8d44");

		txSal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel10.setText("\u5907\u6ce8");

		txt10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton5.setText("\u786e\u8ba4");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton6.setText("\u786e\u8ba4");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setText("\u786e\u8ba4");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		result.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		result.setText("\u64cd\u4f5c\u5b8c\u6210");

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));

		javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(
				rightPanel);
		rightPanel.setLayout(rightPanelLayout);
		rightPanelLayout
				.setHorizontalGroup(rightPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								rightPanelLayout
										.createSequentialGroup()
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								rightPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel6)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												txStartDate))
																						.addGroup(
																								rightPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												txRecordNo,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												85,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel7)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								txId,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								85,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txEndDate,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								85,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				15,
																				15,
																				15)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel8))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								txDays,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								85,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								txAllowPerson,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								85,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								rightPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel4)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												txReason,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												85,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								rightPanelLayout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel9)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												txDate,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												85,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel10)
																						.addComponent(
																								jLabel5)))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				117,
																				117,
																				117)
																		.addComponent(
																				jButton5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton6)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton8)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																txSal,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																85,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																txt10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																85,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(339, Short.MAX_VALUE))
						.addGroup(
								rightPanelLayout
										.createSequentialGroup()
										.addGap(88, 88, 88)
										.addComponent(
												jLabel11,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												335,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(102, 102, 102).addComponent(
												result).addContainerGap(803,
												Short.MAX_VALUE)));
		rightPanelLayout
				.setVerticalGroup(rightPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								rightPanelLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(result)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																45,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(16, 16, 16)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																txRecordNo,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2)
														.addComponent(
																txId,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3)
														.addComponent(
																txDays,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																txReason,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(
																txSal,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																txStartDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7)
														.addComponent(
																txEndDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel8)
														.addComponent(
																txAllowPerson,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel9)
														.addComponent(
																txDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel10)
														.addComponent(
																txt10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addGroup(
																				rightPanelLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton5)
																						.addComponent(
																								jButton6))
																		.addContainerGap())
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton8)
																		.addContainerGap()))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												leftPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												149,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												rightPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(75, Short.MAX_VALUE))
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1657,
								Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																rightPanel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																220,
																Short.MAX_VALUE)
														.addComponent(
																leftPanel,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												644,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		result.setVisible(false);
		jLabel1.setVisible(false);
		jLabel2.setVisible(false);
		jLabel3.setVisible(false);
		jLabel4.setVisible(false);
		jLabel5.setVisible(false);
		jLabel6.setVisible(false);
		jLabel7.setVisible(false);
		jLabel8.setVisible(false);
		jLabel9.setVisible(false);
		jLabel10.setVisible(false);
		jLabel11.setVisible(false);
		txRecordNo.setVisible(false);
		txId.setVisible(false);
		txDays.setVisible(false);
		txReason.setVisible(false);
		txSal.setVisible(false);
		txStartDate.setVisible(false);
		txEndDate.setVisible(false);
		txAllowPerson.setVisible(false);
		txDate.setVisible(false);
		txt10.setVisible(false);
		jButton5.setVisible(false);
		jButton6.setVisible(false);
		jButton8.setVisible(false);
		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		for (int i = 0; i < rightPanel.getComponentCount(); i++) {
			rightPanel.getComponent(i).setVisible(false);
		}
		jLabel1.setVisible(true);
		txRecordNo.setVisible(true);
		jButton8.setVisible(true);
		jLabel11.setText("请输入你要" + jButton4.getText() + "的信息");
		jLabel11.setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		for (int i = 0; i < rightPanel.getComponentCount(); i++) {
			rightPanel.getComponent(i).setVisible(false);
		}
		jLabel1.setVisible(true);
		txRecordNo.setVisible(true);
		jButton6.setVisible(true);
		jLabel11.setText("请输入你要" + jButton2.getText() + "的信息");
		jLabel11.setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel1.setVisible(true);
		jLabel2.setVisible(true);
		jLabel3.setVisible(true);
		jLabel4.setVisible(true);
		jLabel5.setVisible(true);
		jLabel6.setVisible(true);
		jLabel7.setVisible(true);
		jLabel8.setVisible(true);
		jLabel9.setVisible(true);
		jLabel10.setVisible(true);
		txRecordNo.setVisible(true);
		txId.setVisible(true);
		txDays.setVisible(true);
		txReason.setVisible(true);
		txSal.setVisible(true);
		txStartDate.setVisible(true);
		txEndDate.setVisible(true);
		txAllowPerson.setVisible(true);
		txDate.setVisible(true);
		txt10.setVisible(true);
		jButton5.setVisible(true);
		jLabel11.setText("请输入你要" + jButton1.getText() + "的信息");
		jLabel11.setVisible(true);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		for (int i = 0; i < rightPanel.getComponentCount(); i++) {
			rightPanel.getComponent(i).setVisible(false);
		}
		result.setVisible(true);
		StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();
		staffLeaveService.selectOne(jTable1, Integer.parseInt(txRecordNo
				.getText().trim()));
		txRecordNo.setText("");
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
			for (int i = 0; i < rightPanel.getComponentCount(); i++) {
				rightPanel.getComponent(i).setVisible(false);
			}
			result.setVisible(true);
		StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();
		staffLeaveService.deleteOne(Integer.parseInt(txRecordNo.getText()));
		staffLeaveService.selectAll(jTable1);
		txRecordNo.setText("");
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		for (int i = 0; i < rightPanel.getComponentCount(); i++) {
			rightPanel.getComponent(i).setVisible(false);
		}
		result.setVisible(true);
		
		StaffLeave staffLeave = new StaffLeave();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String start = txStartDate.getText().trim();
			java.util.Date uStartDate = new java.util.Date();
			uStartDate = simpleDateFormat.parse(start);
			java.sql.Date startDate = new java.sql.Date(uStartDate.getTime());

			String end = txEndDate.getText().trim();
			java.util.Date uEndDate = new java.util.Date();
			uEndDate = simpleDateFormat.parse(end);
			java.sql.Date endDate = new java.sql.Date(uEndDate.getTime());

			String ask = txDate.getText().trim();
			java.util.Date uAskDate = new java.util.Date();
			uAskDate = simpleDateFormat.parse(ask);
			java.sql.Date askDate = new java.sql.Date(uAskDate.getTime());

			staffLeave.setStaffLeaveNo(Integer.parseInt(txRecordNo.getText()
					.trim()));
			staffLeave.setStaffId(Integer.parseInt(txId.getText().trim()));
			staffLeave.setLeaveDays(Integer.parseInt(txDays.getText().trim()));
			staffLeave.setLeaveReason(txReason.getText().trim());
			staffLeave.setLeaveDisSal(Integer.parseInt(txSal.getText().trim()));
			staffLeave.setLeaveStartDate(startDate);
			staffLeave.setLeaveEndDate(endDate);
			staffLeave.setLeaveAllowPerson(txAllowPerson.getText().trim());
			staffLeave.setLeaveAskDate(askDate);
			staffLeave.setLeaveRemarks(txt10.getText().trim());

			StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();
			staffLeaveService.addOne(staffLeave);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		staffLeaveService.selectAll(jTable1);
		txAllowPerson.setText("");
		txDate.setText("");
		txDays.setText("");
		txEndDate.setText("");
		txId.setText("");
		txReason.setText("");
		txRecordNo.setText("");
		txSal.setText("");
		txStartDate.setText("");
		txt10.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JPanel leftPanel;
	private javax.swing.JLabel result;
	private javax.swing.JPanel rightPanel;
	private javax.swing.JTextField txAllowPerson;
	private javax.swing.JTextField txDate;
	private javax.swing.JTextField txDays;
	private javax.swing.JTextField txEndDate;
	private javax.swing.JTextField txId;
	private javax.swing.JTextField txReason;
	private javax.swing.JTextField txRecordNo;
	private javax.swing.JTextField txSal;
	private javax.swing.JTextField txStartDate;
	private javax.swing.JTextField txt10;
	// End of variables declaration//GEN-END:variables

}