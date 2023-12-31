
package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import com.buttons.simple.SimpleButton;

import utils.Metodos;

public class pnlHome extends javax.swing.JPanel {

	public pnlHome() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	
	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		btnNewButton = new SimpleButton("Ver");
		btnNewButton.setIcon(new ImageIcon(pnlHome.class.getResource("/img/view.png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBorderColor(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Metodos.abrirCarpeta("https://es.wordpress.org/download/");
				} catch (IOException e1) {

				}
			}
		});

		btnNewButton_1 = new SimpleButton("Descargar");
		btnNewButton_1.setIcon(new ImageIcon(pnlHome.class.getResource("/img/download.png")));
		btnNewButton_1.setBorderColor(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Metodos.abrirCarpeta("https://es.wordpress.org/latest-es_ES.zip");
				} catch (IOException e1) {

				}
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(272).addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
				.addGap(31).addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(522, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(149)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(457, Short.MAX_VALUE)));
		this.setLayout(layout);
	}

	private SimpleButton btnNewButton;
	private SimpleButton btnNewButton_1;
	
}
