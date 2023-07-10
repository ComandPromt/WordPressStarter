/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import com.buttons.simple.SimpleButton;
import com.spinner.decimal.DecimalSpinner;
import com.spinner.simple.Spinner;

import textarea.CopyTextAreaScroll;

/**
 *
 * @author RojeruSan
 */
public class pnlAndroid extends javax.swing.JPanel {
	private SimpleButton btnNewButton;
	private Spinner ancho;
	private Spinner alto;
	private DecimalSpinner x;
	private DecimalSpinner y;

	/**
	 * Creates new form pnlHome
	 */
	public pnlAndroid() {
		setBackground(Color.WHITE);
		CopyTextAreaScroll resultado = new CopyTextAreaScroll();
		btnNewButton = new SimpleButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (ancho.getValor() > 0 && alto.getValor() > 0) {

					resultado.setText("(x+Math.round(anchura*"
							+ (Math.round((x.getValor() * 100) / ancho.getValor())) * 0.01 + "),(y+Math.round(altura*"
							+ (Math.round((y.getValor() * 100) / alto.getValor())) * 0.01 + ")");

				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));

		ancho = new Spinner();
		ancho.setFont(new Font("Tahoma", Font.PLAIN, 16));

		alto = new Spinner();
		alto.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNewLabel = new JLabel("Ancho");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1 = new JLabel("Alto");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.RIGHT);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 20));

		x = new DecimalSpinner();
		x.setIncremento(0.1f);
		x.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNewLabel_1_1 = new JLabel("Y");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		y = new DecimalSpinner();
		y.setIncremento(0.1f);
		y.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false).addGroup(groupLayout
						.createSequentialGroup().addComponent(lblNewLabel).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(ancho, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(alto, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblX, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(x, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 66,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(y, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(resultado, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(98)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(alto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(ancho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel).addComponent(lblNewLabel_1))
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblX, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(x, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(y, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGap(27).addComponent(resultado, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(43, Short.MAX_VALUE)));
		setLayout(groupLayout);
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
	}// </editor-fold>//GEN-END:initComponents
}
