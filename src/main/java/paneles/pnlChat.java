
package paneles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.buttons.simple.SimpleButton;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;
import com.textField.simple.TextField;

import utils.Metodos;

public class pnlChat extends javax.swing.JPanel {

	private ComboBoxSuggestion tipo = new ComboBoxSuggestion();

	private ComboBoxSuggestion accion = new ComboBoxSuggestion();

	private TextField web;

	public pnlChat() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		SimpleButton btnNewButton = new SimpleButton("Generate");
		btnNewButton.setText("Acceder al sitio web");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					Metodos.abrirCarpeta(web.getText());

				}

				catch (Exception e1) {

				}

			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		web = new TextField();
		web.setFont(new Font("Tahoma", Font.PLAIN, 16));

		web.setText("/wp-login.php");

		web.setColumns(10);

		JButton btnNewButton_1 = new JButton(">>");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING,
						layout.createSequentialGroup().addGap(397)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(126))
				.addGroup(layout.createSequentialGroup().addGap(342).addComponent(btnNewButton_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(web, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(126, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(126)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(web, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1))
						.addGap(172)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(345, Short.MAX_VALUE)));

		this.setLayout(layout);

	}
}
