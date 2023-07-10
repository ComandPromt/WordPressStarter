package principal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.about.PG1;
import com.buttons.simple.ButtonMetro;

import paneles.CambiaPanel;

public class Principal extends javax.swing.JFrame {

	int x, y;

	public Principal() {

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
		cinco = new ButtonMetro("");
		ocho = new ButtonMetro("");
		siete = new ButtonMetro("");
		seis = new ButtonMetro("");
		cuatro = new ButtonMetro("");
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jCTextField1 = new TextField();
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
		uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
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
		tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png"))); // NOI18N
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
		dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
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

		cinco.setBackground(new java.awt.Color(239, 238, 244));
		cinco.setForeground(new java.awt.Color(128, 128, 131));
		cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/market.png"))); // NOI18N
		cinco.setText("SQL");
		cinco.setColorHover(new java.awt.Color(204, 204, 204));
		cinco.setColorNormal(new java.awt.Color(239, 238, 244));
		cinco.setColorPressed(new java.awt.Color(204, 204, 204));
		cinco.setColorTextHover(new java.awt.Color(128, 128, 131));
		cinco.setColorTextNormal(new java.awt.Color(128, 128, 131));
		cinco.setColorTextPressed(new java.awt.Color(128, 128, 131));
		cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		cinco.setIconTextGap(19);
		cinco.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				cincoMousePressed(evt);
			}
		});
		cinco.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cincoActionPerformed(evt);
			}
		});

		ocho.setBackground(new java.awt.Color(239, 238, 244));
		ocho.setForeground(new java.awt.Color(128, 128, 131));
		ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png"))); // NOI18N
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

		siete.setBackground(new java.awt.Color(239, 238, 244));
		siete.setForeground(new java.awt.Color(128, 128, 131));
		siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ios.png"))); // NOI18N
		siete.setText("IOS");
		siete.setColorHover(new java.awt.Color(204, 204, 204));
		siete.setColorNormal(new java.awt.Color(239, 238, 244));
		siete.setColorPressed(new java.awt.Color(204, 204, 204));
		siete.setColorTextHover(new java.awt.Color(128, 128, 131));
		siete.setColorTextNormal(new java.awt.Color(128, 128, 131));
		siete.setColorTextPressed(new java.awt.Color(128, 128, 131));
		siete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		siete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		siete.setIconTextGap(19);
		siete.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				sieteMousePressed(evt);
			}
		});
		siete.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sieteActionPerformed(evt);
			}
		});

		seis.setBackground(new java.awt.Color(239, 238, 244));
		seis.setForeground(new java.awt.Color(128, 128, 131));
		seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/android.png"))); // NOI18N
		seis.setText("Android");
		seis.setColorHover(new java.awt.Color(204, 204, 204));
		seis.setColorNormal(new java.awt.Color(239, 238, 244));
		seis.setColorPressed(new java.awt.Color(204, 204, 204));
		seis.setColorTextHover(new java.awt.Color(128, 128, 131));
		seis.setColorTextNormal(new java.awt.Color(128, 128, 131));
		seis.setColorTextPressed(new java.awt.Color(128, 128, 131));
		seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		seis.setIconTextGap(25);
		seis.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				seisMousePressed(evt);
			}
		});
		seis.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				seisActionPerformed(evt);
			}
		});

		cuatro.setBackground(new java.awt.Color(239, 238, 244));
		cuatro.setForeground(new java.awt.Color(128, 128, 131));
		cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/feeedback.png"))); // NOI18N
		cuatro.setText("Java");
		cuatro.setColorHover(new java.awt.Color(204, 204, 204));
		cuatro.setColorNormal(new java.awt.Color(239, 238, 244));
		cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
		cuatro.setColorTextHover(new java.awt.Color(128, 128, 131));
		cuatro.setColorTextNormal(new java.awt.Color(128, 128, 131));
		cuatro.setColorTextPressed(new java.awt.Color(128, 128, 131));
		cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
		cuatro.setIconTextGap(19);
		cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mousePressed(java.awt.event.MouseEvent evt) {
				cuatroMousePressed(evt);
			}
		});
		cuatro.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cuatroActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
		pnlMenuLayout.setHorizontalGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup()
						.addGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(uno, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(dos, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(tres, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(seis, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(siete, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
								.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(15, Short.MAX_VALUE)));
		pnlMenuLayout.setVerticalGroup(pnlMenuLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnlMenuLayout.createSequentialGroup().addContainerGap()
						.addComponent(uno, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(dos, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(cuatro, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(4)
						.addComponent(seis, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(siete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE).addGap(0)
						.addComponent(ocho, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(422, Short.MAX_VALUE)));
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

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
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
		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("Dashboard - RojeruSan");

		jCTextField1.setBackground(new java.awt.Color(38, 86, 186));
		jCTextField1.setForeground(new java.awt.Color(255, 255, 255));
		jCTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jButton1)
						.addGap(18, 18, 18).addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
						.addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

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
	}// </editor-fold>//GEN-END:initComponents

	private void unoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_unoActionPerformed
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

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_unoActionPerformed

	private void unoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_unoMousePressed
		this.uno.setSelected(true);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_unoMousePressed

	private void tresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tresActionPerformed
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

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_tresActionPerformed

	private void tresMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tresMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(true);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_tresMousePressed

	private void dosMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dosMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(true);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_dosMousePressed

	private void dosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dosActionPerformed
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

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_dosActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		int posicion = pnlMenu.getX();
		if (posicion > -1) {
			Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
		} else {
			Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void ochoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ochoMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(true);
	}

	private void ochoActionPerformed(java.awt.event.ActionEvent evt) {

		new PG1();

	}

	private void sieteMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_sieteMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(true);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_sieteMousePressed

	private void sieteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sieteActionPerformed
		new CambiaPanel(pnlPrincipal, new paneles.pnlIOS());
		if (this.siete.isSelected()) {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(204, 204, 204));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_sieteActionPerformed

	private void seisMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_seisMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(false);
		this.seis.setSelected(true);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_seisMousePressed

	private void seisActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_seisActionPerformed
		new CambiaPanel(pnlPrincipal, new paneles.pnlAndroid());
		if (this.seis.isSelected()) {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(204, 204, 204));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_seisActionPerformed

	private void cincoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cincoActionPerformed
		new CambiaPanel(pnlPrincipal, new paneles.pnlMarket());
		if (this.cinco.isSelected()) {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(204, 204, 204));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_cincoActionPerformed

	private void cincoMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cincoMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(false);
		this.cinco.setSelected(true);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_cincoMousePressed

	private void cuatroMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cuatroMousePressed
		this.uno.setSelected(false);
		this.dos.setSelected(false);
		this.tres.setSelected(false);
		this.cuatro.setSelected(true);
		this.cinco.setSelected(false);
		this.seis.setSelected(false);
		this.siete.setSelected(false);
		this.ocho.setSelected(false);
	}// GEN-LAST:event_cuatroMousePressed

	private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cuatroActionPerformed
		new CambiaPanel(pnlPrincipal, new paneles.pnlFeeBack());
		if (this.cuatro.isSelected()) {
			this.uno.setColorNormal(new Color(239, 238, 244));
			this.uno.setColorHover(new Color(204, 204, 204));
			this.uno.setColorPressed(new Color(204, 204, 204));

			this.dos.setColorNormal(new Color(239, 238, 244));
			this.dos.setColorHover(new Color(204, 204, 204));
			this.dos.setColorPressed(new Color(204, 204, 204));

			this.tres.setColorNormal(new Color(239, 238, 244));
			this.tres.setColorHover(new Color(204, 204, 204));
			this.tres.setColorPressed(new Color(204, 204, 204));

			this.cuatro.setColorNormal(new Color(204, 204, 204));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));

			this.cinco.setColorNormal(new Color(239, 238, 244));
			this.cinco.setColorHover(new Color(204, 204, 204));
			this.cinco.setColorPressed(new Color(204, 204, 204));

			this.seis.setColorNormal(new Color(239, 238, 244));
			this.seis.setColorHover(new Color(204, 204, 204));
			this.seis.setColorPressed(new Color(204, 204, 204));

			this.siete.setColorNormal(new Color(239, 238, 244));
			this.siete.setColorHover(new Color(204, 204, 204));
			this.siete.setColorPressed(new Color(204, 204, 204));

			this.ocho.setColorNormal(new Color(239, 238, 244));
			this.ocho.setColorHover(new Color(204, 204, 204));
			this.ocho.setColorPressed(new Color(204, 204, 204));
		} else {
			this.cuatro.setColorNormal(new Color(239, 238, 244));
			this.cuatro.setColorHover(new Color(204, 204, 204));
			this.cuatro.setColorPressed(new Color(204, 204, 204));
		}
	}// GEN-LAST:event_cuatroActionPerformed

	private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MousePressed
		x = evt.getX();
		y = evt.getY();
	}// GEN-LAST:event_jPanel2MousePressed

	private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseDragged
		Point mueve = MouseInfo.getPointerInfo().getLocation();
		this.setLocation(mueve.x - x, mueve.y - y);
	}// GEN-LAST:event_jPanel2MouseDragged

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
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
		// </editor-fold>

		/* Create and display the form */
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

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private ButtonMetro cinco;
	private ButtonMetro cuatro;
	private ButtonMetro dos;
	private javax.swing.JButton jButton1;
	private TextField jCTextField1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private ButtonMetro ocho;
	private javax.swing.JPanel pnlCentro;
	private javax.swing.JPanel pnlMenu;
	private javax.swing.JPanel pnlPrincipal;
	private ButtonMetro seis;
	private ButtonMetro siete;
	private ButtonMetro tres;
	private ButtonMetro uno;
	private GridBagConstraints gridBagConstraints_1;
	private GridBagConstraints gridBagConstraints_2;
}
