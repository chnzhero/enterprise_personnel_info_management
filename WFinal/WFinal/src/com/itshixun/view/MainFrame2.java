/*
 * MainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itshixun.view;

import com.itshixun.view.SalChange2;
import com.itshixun.view.StaffInfo2;
import com.itshixun.view.StaffLeave2;
import com.itshixun.view.StaffLeave2;
import com.itshixun.view.StaffTransfer2;

/**
 * 
 * @author __USER__
 */
public class MainFrame2 extends javax.swing.JFrame {
	LoginFrame login;

	/** Creates new form MainFrame */
	public void initM() {

	}

	public MainFrame2() {

		initComponents();
		this.setExtendedState(this.MAXIMIZED_BOTH);
		initM();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		popupMenu1 = new java.awt.PopupMenu();
		leftp = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();

		popupMenu1.setLabel("PopupMenu");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u4eba\u529b\u8d44\u6e90\u7ba1\u7406\u7cfb\u7edf\u540e\u53f0");

		leftp.setBackground(new java.awt.Color(255, 255, 255));
		leftp.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30));
		jButton1.setText("\u5458\u5de5");

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setText("\u8c03\u804c\u4fe1\u606f");
		jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel1MouseClicked(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u8bf7\u5047\u4fe1\u606f");
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel2MouseClicked(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setText("\u8c03\u85aa\u4fe1\u606f");
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel3MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addGroup(
						jPanel5Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel1).addComponent(jLabel2)
								.addComponent(jLabel3)).addContainerGap(30,
						Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel3).addContainerGap(
												46, Short.MAX_VALUE)));

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setText("\u5458\u5de5\u4fe1\u606f");
		jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel6MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				27,
																				27,
																				27)
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				99,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel6)))
										.addContainerGap(28, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addComponent(jButton1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 41,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(11, 11,
						11).addComponent(jLabel6).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel5,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(57, Short.MAX_VALUE)));

		javax.swing.GroupLayout leftpLayout = new javax.swing.GroupLayout(leftp);
		leftp.setLayout(leftpLayout);
		leftpLayout.setHorizontalGroup(leftpLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				leftpLayout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		leftpLayout.setVerticalGroup(leftpLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				leftpLayout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel4,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(325, Short.MAX_VALUE)));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));
		jPanel3.setAutoscrolls(true);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1045,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 674,
				Short.MAX_VALUE));

		jMenu1.setText("\u6587\u4ef6");
		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u5e2e\u52a9");
		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u9000\u51fa");
		jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jMenu3MouseClicked(evt);
			}
		});
		jMenu3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu3ActionPerformed(evt);
			}
		});
		jMenuBar1.add(jMenu3);

		jMenu4.setText("Menu");
		jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

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
												leftp,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(leftp,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel3,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffInfo2 si2 = new StaffInfo2();
		si2.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		si2.setVisible(true);
		this.jPanel3.add(si2);
	}

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		SalChange2 sc2 = new SalChange2();
		sc2.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		sc2.setVisible(true);
		this.jPanel3.add(sc2);
	}

	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffLeave2 sl2 = new StaffLeave2();
		sl2.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		sl2.setVisible(true);
		this.jPanel3.add(sl2);
	}

	private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffTransfer2 st2 = new StaffTransfer2();
		st2.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		st2.setVisible(true);
		this.jPanel3.add(st2);
	}

	private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {
		System.out.println("clickout");
		login.setVisible(true);
		this.setVisible(false);

	}

	private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {
		System.out.println("out");
		this.setVisible(false);

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame2().setVisible(true);
			}
		});
	}

	public void setjMenu4(javax.swing.JMenu jMenu4) {
		this.jMenu4 = jMenu4;
	}

	public javax.swing.JMenu getjMenu4() {
		return jMenu4;
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel leftp;
	private java.awt.PopupMenu popupMenu1;
	// End of variables declaration//GEN-END:variables

}