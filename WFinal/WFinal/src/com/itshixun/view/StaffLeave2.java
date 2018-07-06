/*
 * t_staff_leave.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itshixun.view;

import com.itshixun.service.StaffLeaveService;
import com.itshixun.service.impl.StaffLeaveServiceImpl;

/**
 * 
 * @author __USER__
 */
public class StaffLeave2 extends javax.swing.JInternalFrame {

	/** Creates new form t_staff_leave */
	public StaffLeave2() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		leftPanel = new javax.swing.JPanel();
		rightPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txt1 = new javax.swing.JTextField();
		jButton8 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "请假记录号", "编号", "请假天数", "请假事由", "扣除工资",
						"开始日期", "结束日期", "批准人", "请假日期" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(
				leftPanel);
		leftPanel.setLayout(leftPanelLayout);
		leftPanelLayout.setHorizontalGroup(leftPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 144,
				Short.MAX_VALUE));
		leftPanelLayout.setVerticalGroup(leftPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 202,
				Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setText("\u7f16\u53f7");

		txt1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setText("\u67e5\u8be2");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel11
				.setText("\u8bf7\u8f93\u5165\u8981\u67e5\u8be2\u7684\u4fe1\u606f");

		jButton9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton9.setText("\u67e5\u8be2\u6240\u6709");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

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
																				89,
																				89,
																				89)
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				txt1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				173,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				109,
																				109,
																				109)
																		.addComponent(
																				jLabel11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				218,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				243,
																				243,
																				243)
																		.addComponent(
																				jButton8)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				jButton9)))
										.addContainerGap(510, Short.MAX_VALUE)));
		rightPanelLayout
				.setVerticalGroup(rightPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								rightPanelLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel11,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												68, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																txt1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton8)
														.addComponent(jButton9))
										.addContainerGap()));

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
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												rightPanel,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)).addComponent(
								jScrollPane1,
								javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1134,
								Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGroup(
						layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING,
								false).addComponent(leftPanel,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addComponent(rightPanel,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 555,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();
		staffLeaveService.selectAll(jTable1);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		StaffLeaveService staffLeaveService = new StaffLeaveServiceImpl();
		staffLeaveService.selectOne(jTable1, Integer.parseInt(txt1.getText()
				.trim()));
		txt1.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JPanel leftPanel;
	private javax.swing.JPanel rightPanel;
	private javax.swing.JTextField txt1;
	// End of variables declaration//GEN-END:variables

}