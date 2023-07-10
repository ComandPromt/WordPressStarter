
package paneles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.buttons.simple.SimpleButton;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;

import textarea.CopyTextAreaScroll;

public class pnlChat extends javax.swing.JPanel {

	private javax.swing.JLabel jLabel7;

	private ComboBoxSuggestion tipo = new ComboBoxSuggestion();

	private ComboBoxSuggestion accion = new ComboBoxSuggestion();
	CopyTextAreaScroll entrada;

	public pnlChat() {

		initComponents();

		tipo.addItem("JPA");

		accion.addItem("Hibernate");

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel7 = new javax.swing.JLabel();

		setBackground(new java.awt.Color(255, 255, 255));

		jLabel7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N

		jLabel7.setForeground(new java.awt.Color(128, 128, 131));

		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png"))); // NOI18N

		jLabel7.setText("CHAT");

		entrada = new CopyTextAreaScroll();

		entrada.setFontSize(30);

		entrada.setLabelText("aa");

		entrada.setText("");

		entrada.setText("www");

		tipo = new ComboBoxSuggestion();

		accion = new ComboBoxSuggestion();

		tipo.setFont(new Font("Tahoma", Font.PLAIN, 18));

		tipo.setEditable(false);

		accion.setFont(new Font("Tahoma", Font.PLAIN, 18));

		accion.setEditable(false);

		CopyTextAreaScroll resultado = new CopyTextAreaScroll();

		resultado.setText("");

		resultado.setLabelText("aa");

		resultado.setFontSize(30);

		SimpleButton btnNewButton = new SimpleButton("Generate");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				resultado
						.setText(generarCodigo(tipo.getSelectedItem().toString(), accion.getSelectedItem().toString()));

			}

			private String generarCodigo(String tipo, String accion) {

				String resultado = "";

				switch (tipo) {

				case "JPA":

					switch (accion) {

					case "Hibernate":
						System.out.println(entrada.getText());
						break;

					}

					break;

				}

				return resultado;

			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel7,
								GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(28).addGroup(layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE)
										.addGap(31)
										.addComponent(accion, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(entrada, GroupLayout.PREFERRED_SIZE, 449,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
										.addComponent(resultado, GroupLayout.PREFERRED_SIZE, 448,
												GroupLayout.PREFERRED_SIZE)))
								.addGap(9))
						.addGroup(layout.createSequentialGroup().addGap(358).addComponent(btnNewButton,
								GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel7).addGap(26)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(accion, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(resultado, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
								.addComponent(entrada, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE))
						.addContainerGap()));

		this.setLayout(layout);

	}

}
