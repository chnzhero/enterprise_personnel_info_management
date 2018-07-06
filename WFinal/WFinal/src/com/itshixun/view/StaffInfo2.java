/*
 * t_staff_info.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itshixun.view;

import com.itshixun.service.StaffInfoService;
import com.itshixun.service.impl.StaffInfoServiceImpl;

/**
 * 
 * @author __USER__
 */
public class StaffInfo2 extends javax.swing.JInternalFrame {

	/** Creates new form t_staff_info */
	public StaffInfo2() {
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
		jLabel7 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "姓名", "编号", "部门编号", "职位名称", "性别" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(
				leftPanel);
		leftPanel.setLayout(leftPanelLayout);
		leftPanelLayout.setHorizontalGroup(leftPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 141,
				Short.MAX_VALUE));
		leftPanelLayout.setVerticalGroup(leftPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 188,
				Short.MAX_VALUE));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setText("\u7f16\u53f7");

		txt1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton8.setText("\u67e5\u8be2");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel7
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
																				88,
																				88,
																				88)
																		.addComponent(
																				jLabel1)
																		.addGap(
																				18,
																				18,
																				18)
																		.addComponent(
																				txt1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				188,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				108,
																				108,
																				108)
																		.addComponent(
																				jLabel7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				222,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addGap(
																				167,
																				167,
																				167)
																		.addComponent(
																				jButton8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton9)))
										.addContainerGap(163, Short.MAX_VALUE)));
		rightPanelLayout
				.setVerticalGroup(rightPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								rightPanelLayout
										.createSequentialGroup()
										.addComponent(
												jLabel7,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												53, Short.MAX_VALUE)
										.addGap(19, 19, 19)
										.addGroup(
												rightPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(
																				27,
																				27,
																				27))
														.addGroup(
																rightPanelLayout
																		.createSequentialGroup()
																		.addComponent(
																				txt1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)))
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
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(leftPanel,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18,
						18).addComponent(rightPanel,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(jScrollPane1,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 714,
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
								Short.MAX_VALUE)).addGap(18, 18, 18)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 497,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		StaffInfoService staffInfoService = new StaffInfoServiceImpl();
		staffInfoService.selectAll(jTable1);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		StaffInfoService staffInfoService = new StaffInfoServiceImpl();
		staffInfoService.selectOne(jTable1, Integer.parseInt(txt1.getText()));
		txt1.setText("");
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JPanel leftPanel;
	private javax.swing.JPanel rightPanel;
	private javax.swing.JTextField txt1;
	// End of variables declaration//GEN-END:variables

}