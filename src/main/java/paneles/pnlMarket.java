package paneles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.buttons.simple.SimpleButton;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;

import textarea.CopyTextAreaScroll;

public class pnlMarket extends javax.swing.JPanel {

	ComboBoxSuggestion<String> tipo;

	SimpleButton btnNewButton;

	CopyTextAreaScroll salida;

	ComboBoxSuggestion<String> accion;

	public pnlMarket() {

		initComponents();

	}

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		accion = new ComboBoxSuggestion<String>();

		accion.setFont(new Font("Tahoma", Font.PLAIN, 18));

		accion.setEditable(false);

		btnNewButton = new SimpleButton("Generate");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		salida = new CopyTextAreaScroll();

		tipo = new ComboBoxSuggestion<String>();

		tipo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				accion.removeAllItems();

				switch (tipo.getSelectedIndex()) {

				case 0:

					accion.addItem("categories");

					accion.addItem("Insert into select");

					break;

				case 1:

					accion.addItem("Change root password");

					break;

				}

			}

		});

		salida.setLabelText("");

		salida.setFontSize(30);

		salida.setEditable(false);

		tipo.setFont(new Font("Tahoma", Font.PLAIN, 18));

		tipo.setEditable(false);

		tipo.addItem("Querys");

		tipo.addItem("Administration");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				switch (tipo.getSelectedIndex()) {

				case 0:

					switch (accion.getSelectedIndex()) {

					case 0:
						salida.setText(
								"SELECT categoria,id FROM categorias WHERE idMadre IS NULL AND id NOT IN (SELECT DISTINCT idMadre FROM categorias WHERE idMadre IS NOT NULL) order by categoria");
						break;

					case 1:

						salida.setText("INSERT INTO table2 (column1, column2, column3, ...)\n"
								+ "SELECT column1, column2, column3, ...\n" + "FROM table1\n" + "WHERE condition;");
						break;

					}

					break;

				case 1:

					switch (accion.getSelectedIndex()) {

					case 0:

						salida.setText("FLUSH PRIVILEGES;\n" + " \n"
								+ "GRANT ALL PRIVILEGES ON *.* TO root@'%' IDENTIFIED BY 'PASSWORD';\n" + "\n"
								+ "FLUSH PRIVILEGES;\n" + " \n" + " chmod 0755 Phpmyadmin/config.inc.php");
						break;

					}

					break;

				}

			}

		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(32)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE).addGap(10)
						.addComponent(accion, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
						.addComponent(salida, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(240, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(accion, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(salida, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		this.setLayout(layout);
	}// </editor-fold>//GEN-END:initComponents
}
