/*
 * MainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itshixun.view;

import java.awt.Toolkit;

import com.itshixun.view.SalChangeView;
import com.itshixun.view.StaffInfoView;
import com.itshixun.view.StaffLeaveView;
import com.itshixun.view.StaffTransferView;
import com.itshixun.view.TUser;
import com.itshixun.view.UserTypeView;

/**
 * 
 * @author __USER__
 */
public class MainFrame extends javax.swing.JFrame {
	LoginFrame login;

	/** Creates new form MainFrame */
	public void initM() {
		jPanel1.setVisible(true);

	}

	public MainFrame() {

		initComponents();
		this.setExtendedState(this.MAXIMIZED_BOTH);
		initM();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		popupMenu1 = new java.awt.PopupMenu();
		leftp = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
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

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseExited(java.awt.event.MouseEvent evt) {
				jPanel2MouseExited(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel4.setText("\u7528    \u6237");
		jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel4MouseClicked(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel5.setText("\u6743\u9650\u7c7b\u578b");
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel5MouseClicked(evt);
			}
		});
		jLabel5.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jLabel5KeyTyped(evt);
			}
		});

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setText("\u5458\u5de5\u4fe1\u606f");
		jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel6MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addComponent(jLabel5)
														.addComponent(jLabel6))
										.addContainerGap(25, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel6).addContainerGap(
												50, Short.MAX_VALUE)));

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30));
		jButton2.setText("\u7528\u6237\u548c\u5458\u5de5");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				187,
																				Short.MAX_VALUE)
																		.addGap(
																				32,
																				32,
																				32)))));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(22, Short.MAX_VALUE)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 30));
		jButton1.setText("\u5458\u5de5\u5404\u9879\u8bb0\u5f55");

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setText("\u8c03\u804c\u8bb0\u5f55");
		jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel1MouseClicked(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u8bf7\u5047\u8bb0\u5f55");
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel2MouseClicked(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setText("\u8c03\u85aa\u8bb0\u5f55");
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel3MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addComponent(jLabel2)
														.addComponent(jLabel3))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
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
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3).addContainerGap(
												22, Short.MAX_VALUE)));

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
														.addComponent(jButton1))
										.addContainerGap(21, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addComponent(jButton1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 41,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18, 18,
						18).addComponent(jPanel5,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(57, Short.MAX_VALUE)));

		javax.swing.GroupLayout leftpLayout = new javax.swing.GroupLayout(leftp);
		leftp.setLayout(leftpLayout);
		leftpLayout
				.setHorizontalGroup(leftpLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								leftpLayout
										.createSequentialGroup()
										.addGroup(
												leftpLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jPanel4,
																javax.swing.GroupLayout.Alignment.LEADING,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		leftpLayout
				.setVerticalGroup(leftpLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								leftpLayout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(114, Short.MAX_VALUE)));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));
		jPanel3.setAutoscrolls(true);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1023,
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
												223,
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

	private void jLabel5KeyTyped(java.awt.event.KeyEvent evt) {
		// TODO add your handling code here:
	}

	private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffInfoView si = new StaffInfoView();
		si.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		si.setVisible(true);
		this.jPanel3.add(si);
	}

	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		UserTypeView ut = new UserTypeView();
		ut.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		ut.setVisible(true);
		this.jPanel3.add(ut);
	}

	private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		TUser tu = new TUser();
		tu.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		tu.setVisible(true);
		this.jPanel3.add(tu);
	}

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		SalChangeView sc = new SalChangeView();
		sc.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		sc.setVisible(true);
		this.jPanel3.add(sc);
	}

	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffLeaveView sl = new StaffLeaveView();
		sl.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		sl.setVisible(true);
		this.jPanel3.add(sl);
	}

	private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {
		if (jPanel3.getComponentCount() != 0) {
			jPanel3.removeAll();
			jPanel3.repaint();
		}
		StaffTransferView st = new StaffTransferView();
		st.setSize(jPanel3.getWidth(), jPanel3.getHeight());
		st.setVisible(true);
		this.jPanel3.add(st);
	}

	private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {
		// initM();
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
				new MainFrame().setVisible(true);
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
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel leftp;
	private java.awt.PopupMenu popupMenu1;
	// End of variables declaration//GEN-END:variables

}