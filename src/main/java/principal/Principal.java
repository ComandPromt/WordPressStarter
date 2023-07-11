package principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.about.PG1;
import com.buttons.simple.ButtonMetro;

import Animacion.Animacion;
import paneles.CambiaPanel;

public class Principal extends javax.swing.JFrame {

	int x, y;

	public Principal() {

		setTitle("WordPress Starter");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/wordpress.png")));

		initComponents();

		setExtendedState(MAXIMIZED_BOTH);

		this.setLocationRelativeTo(this);

		this.uno.setSelected(true);

		new CambiaPanel(pnlPrincipal, new paneles.pnlHome());

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		pnlMenu = new javax.swing.JPanel();
		uno = new ButtonMetro("");
		tres = new ButtonMetro("");
		dos = new ButtonMetro("");
		ocho = new ButtonMetro("");
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton1.setFocusPainted(false);
		jLabel2 = new javax.swing.JLabel();
		pnlCentro = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pnlPrincipal = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));
		jPanel1.setLayout(new java.awt.GridBagLayout());

		pnlMenu.setBackground(new java.awt.Color(239, 238, 244));
		pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));

		uno.setForeground(new java.awt.Color(128, 128, 131));
		uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png")));
		uno.setText("Home");
		uno.setColorHover(new java.awt.Color(204, 204, 204));
		uno.setColorNormal(new java.awt.Color(204, 204, 204));
		uno.setColorPressed(new java.awt.Color(204, 204, 204));
		uno.setColorTextHover(new java.awt.Color(128, 128, 131));
		uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
		uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
		uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		uno.setIconTextGap(25);
		uno.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				unoMousePressed(evt);
			}
		});
		uno.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				unoActionPerformed(evt);
			}
		});

		tres.setBackground(new java.awt.Color(239, 238, 244));
		tres.setForeground(new java.awt.Color(128, 128, 131));
		tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png")));
		tres.setText("Acceso");
		tres.setColorHover(new java.awt.Color(204, 204, 204));
		tres.setColorNormal(new java.awt.Color(239, 238, 244));
		tres.setColorPressed(new java.awt.Color(204, 204, 204));
		tres.setColorTextHover(new java.awt.Color(128, 128, 131));
		tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
		tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
		tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		tres.setIconTextGap(19);
		tres.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tresMousePressed(evt);
			}
		});
		tres.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tresActionPerformed(evt);
			}
		});

		dos.setBackground(new java.awt.Color(239, 238, 244));
		dos.setForeground(new java.awt.Color(128, 128, 131));
		dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png")));
		dos.setText("Instalación");
		dos.setColorHover(new java.awt.Color(204, 204, 204));
		dos.setColorNormal(new java.awt.Color(239, 238, 244));
		dos.setColorPressed(new java.awt.Color(204, 204, 204));
		dos.setColorTextHover(new java.awt.Color(128, 128, 131));
		dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
		dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
		dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		dos.setIconTextGap(25);
		dos.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				dosMousePressed(evt);
			}
		});
		dos.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dosActionPerformed(evt);
			}
		});

		ocho.setBackground(new java.awt.Color(239, 238, 244));
		ocho.setForeground(new java.awt.Color(128, 128, 131));
		ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png")));
		ocho.setText("Sobre");
		ocho.setColorHover(new java.awt.Color(204, 204, 204));
		ocho.setColorNormal(new java.awt.Color(239, 238, 244));
		ocho.setColorPressed(new java.awt.Color(204, 204, 204));
		ocho.setColorTextHover(new java.awt.Color(128, 128, 131));
		ocho.setColorTextNormal(new java.awt.Color(128, 128, 131));
		ocho.setColorTextPressed(new java.awt.Color(128, 128, 131));
		ocho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		ocho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		ocho.setIconTextGap(19);
		ocho.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				ochoMousePressed(evt);
			}
		});
		ocho.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ochoActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
		pnlMenuLayout.setHorizontalGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup()
						.addGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(uno, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(dos, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(tres, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));
		pnlMenuLayout.setVerticalGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup().addContainerGap()
						.addComponent(uno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(dos, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(608, Short.MAX_VALUE)));
		pnlMenu.setLayout(pnlMenuLayout);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.weighty = 8.3;
		gridBagConstraints.insets = new Insets(0, 0, 5, 5);
		jPanel1.add(pnlMenu, gridBagConstraints);

		jPanel2.setBackground(new java.awt.Color(38, 86, 186));
		jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
		jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			@Override
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jPanel2MouseDragged(evt);
			}
		});
		jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jPanel2MousePressed(evt);
			}
		});

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png")));
		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel2.setBackground(new java.awt.Color(255, 255, 255));
		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("WordPress Starter");
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jButton1).addGap(18)
						.addComponent(jLabel2).addContainerGap(758, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2.setLayout(jPanel2Layout);

		gridBagConstraints_1 = new java.awt.GridBagConstraints();
		gridBagConstraints_1.insets = new Insets(0, 0, 5, 0);
		gridBagConstraints_1.gridx = 0;
		gridBagConstraints_1.gridy = 0;
		gridBagConstraints_1.gridwidth = 3;
		gridBagConstraints_1.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints_1.anchor = java.awt.GridBagConstraints.PAGE_START;
		gridBagConstraints_1.weightx = 0.2;
		jPanel1.add(jPanel2, gridBagConstraints_1);

		pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

		jScrollPane1.setBorder(null);

		pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
		pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
		jScrollPane1.setViewportView(pnlPrincipal);

		javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
		pnlCentroLayout.setHorizontalGroup(pnlCentroLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE));
		pnlCentroLayout.setVerticalGroup(pnlCentroLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlCentroLayout.createSequentialGroup().addGap(50)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		pnlCentro.setLayout(pnlCentroLayout);

		gridBagConstraints_2 = new java.awt.GridBagConstraints();
		gridBagConstraints_2.insets = new Insets(0, 0, 5, 0);
		gridBagConstraints_2.gridx = 1;
		gridBagConstraints_2.gridy = 1;
		gridBagConstraints_2.gridwidth = 2;
		gridBagConstraints_2.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints_2.weightx = 0.4;
		gridBagConstraints_2.weighty = 0.1;
		jPanel1.add(pnlCentro, gridBagConstraints_2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	private void unoActionPerformed(java.awt.event.ActionEvent evt) {
		new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
		if (this.uno.isSelected()) {
			this.uno.setColorNormal(new Color(204, 204, 204));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));
		}
	}

	private void unoMousePressed(java.awt.event.MouseEvent evt) {
		this.uno.setSelected(true);
		this.dos.setSelected(false);
		this.tres.setSelected(false);

		this.ocho.setSelected(false);
	}

	private void tresActionPerformed(java.awt.event.ActionEvent evt) {

		new CambiaPanel(pnlPrincipal, new paneles.pnlChat());
		if (this.tres.isSelected()) {
			this.tres.setColorNormal(new Color(204, 204, 204));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));
		}
	}

	private void tresMousePressed(java.awt.event.MouseEvent evt) {
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(true);

		this.ocho.setSelected(false);
	}

	private void dosMousePressed(java.awt.event.MouseEvent evt) {
		this.uno.setSelected(false);
		this.dos.setSelected(true);
		this.tres.setSelected(false);

		this.ocho.setSelected(false);
	}

	private void dosActionPerformed(java.awt.event.ActionEvent evt) {
		new CambiaPanel(pnlPrincipal, new paneles.PnlCollection());
		if (this.dos.isSelected()) {
			this.dos.setColorNormal(new Color(204, 204, 204));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int posicion = pnlMenu.getX();
		if (posicion > -1) {
			Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
		} else {
			Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
		}
	}

	private void ochoMousePressed(java.awt.event.MouseEvent evt) {
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);

		this.ocho.setSelected(true);
	}

	private void ochoActionPerformed(java.awt.event.ActionEvent evt) {

		new PG1();

	}

	private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {
		x = evt.getX();
		y = evt.getY();
	}

	private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
		Point mueve = MouseInfo.getPointerInfo().getLocation();
		this.setLocation(mueve.x - x, mueve.y - y);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					new Principal().setVisible(true);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
					Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

	private ButtonMetro dos;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private ButtonMetro ocho;
	private javax.swing.JPanel pnlCentro;
	private javax.swing.JPanel pnlMenu;
	private javax.swing.JPanel pnlPrincipal;
	private ButtonMetro tres;
	private ButtonMetro uno;
	private GridBagConstraints gridBagConstraints_1;
	private GridBagConstraints gridBagConstraints_2;
}
