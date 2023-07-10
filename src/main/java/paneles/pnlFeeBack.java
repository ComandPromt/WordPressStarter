package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

import com.buttons.simple.SimpleButton;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;
import com.textField.simple.NTextField;

import textarea.CopyTextAreaScroll;

public class pnlFeeBack extends javax.swing.JPanel {

	private NTextField paquete;

	private NTextField clase;

	private NTextField titulo;

	private CopyTextAreaScroll salida;

	private SimpleButton btnNewButton;

	public pnlFeeBack() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		btnNewButton = new SimpleButton("Generate");

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		titulo = new NTextField(Color.RED);
		paquete = new NTextField();
		paquete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		paquete.setCenterText(false);
		paquete.setHorizontalAlignment(SwingConstants.LEFT);

		paquete.setLabelText("Package");

		paquete.setColumns(10);

		clase = new NTextField(Color.RED);
		clase.setLineColor(Color.MAGENTA);
		clase.setSelectionColor(Color.RED);
		clase.setFont(new Font("Tahoma", Font.PLAIN, 17));
		clase.setLabelText("Class");

		clase.setCenterText(true);

		clase.setColumns(10);

		titulo.setSelectionColor(Color.RED);
		titulo.setLineColor(Color.MAGENTA);
		titulo.setLabelText("Title");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		titulo.setColumns(10);
		titulo.setCenterText(true);

		salida = new CopyTextAreaScroll();

		salida.setLabelText("");

		salida.setFontSize(30);

		salida.setEditable(false);

		ComboBoxSuggestion<String> accion = new ComboBoxSuggestion<String>();

		accion.setFont(new Font("Tahoma", Font.PLAIN, 18));

		accion.setEditable(false);

		accion.addItem("Pojo");

		accion.addItem("Pojo Rounded");

		ComboBoxSuggestion<String> tipo = new ComboBoxSuggestion<String>();

		tipo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				accion.removeAllItems();

				switch (tipo.getSelectedIndex()) {

				case 0:

					accion.addItem("Pojo");

					accion.addItem("Pojo Rounded");

					break;

				case 1:

					accion.addItem("Read table");

					break;

				}

			}

		});

		tipo.addItem("JavaX");

		tipo.addItem("SQLite");

		tipo.setFont(new Font("Tahoma", Font.PLAIN, 18));

		tipo.setEditable(false);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String pakete = paquete.getText().trim();

				if (!pakete.isEmpty()) {

					pakete = "package " + pakete + ";\n";

				}

				switch (tipo.getSelectedIndex()) {

				case 0:

					switch (accion.getSelectedIndex()) {

					case 0:

						salida.setText(pakete + "\n" + "import java.awt.Dimension;\n"
								+ "import java.awt.event.ActionEvent;\n" + "import java.io.IOException;\n" + "\n"
								+ "import javax.swing.GroupLayout.Alignment;\n" + "import javax.swing.JFrame;\n"
								+ "import javax.swing.event.ChangeEvent;\n" + "\n" + "@SuppressWarnings(\"all\")\n"
								+ "\n" + "public class " + clase.getText() + " extends javax.swing.JFrame {\n" + "\n"
								+ "	public " + clase.getText() + "() throws IOException {\n" + "\n" + "		setTitle(\""
								+ titulo.getText() + "\");\n" + "\n" + "		initComponents();\n" + "\n"
								+ "		setVisible(true);\n" + "\n" + "	}\n" + "\n"
								+ "	public static void main(String[] args) {\n" + "\n" + "		try {\n"
								+ "			\n" + "			new " + clase.getText() + "().setVisible(true);\n"
								+ "			\n" + "		}\n" + "		\n" + "		catch (Exception e) {\n" + "\n"
								+ "		}\n" + "		\n" + "	}\n" + "\n"
								+ "	public void initComponents() throws IOException {\n" + "\n"
								+ "		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);\n" + "\n"
								+ "		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));\n" + "\n"
								+ "		setResizable(false);\n" + "\n"
								+ "		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());\n"
								+ "\n"
								+ "		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 526, Short.MAX_VALUE));\n"
								+ "\n"
								+ "		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGap(0, 404, Short.MAX_VALUE));\n"
								+ "\n" + "		getContentPane().setLayout(layout);\n" + "\n"
								+ "		setSize(new Dimension(532, 433));\n" + "\n"
								+ "		setLocationRelativeTo(null);\n" + "\n" + "	}\n" + "\n"
								+ "	public void actionPerformed(ActionEvent arg0) {\n" + "\n" + "	}\n" + "\n"
								+ "	public void stateChanged(ChangeEvent e) {\n" + "\n" + "	}\n" + "\n" + "}\n" + "");

						break;

					case 1:

						salida.setText(pakete + "\n" + "import java.awt.Color;\n" + "import java.awt.Dimension;\n"
								+ "import java.awt.Point;\n" + "import java.awt.event.ActionEvent;\n"
								+ "import java.awt.event.ActionListener;\n" + "import java.awt.event.MouseAdapter;\n"
								+ "import java.awt.event.MouseEvent;\n" + "import java.awt.geom.RoundRectangle2D;\n"
								+ "\n" + "import javax.swing.GroupLayout;\n"
								+ "import javax.swing.GroupLayout.Alignment;\n" + "import javax.swing.JButton;\n"
								+ "import javax.swing.JFrame;\n"
								+ "import javax.swing.LayoutStyle.ComponentPlacement;\n"
								+ "import javax.swing.event.ChangeEvent;\n"
								+ "import javax.swing.event.ChangeListener;\n" + "\n" + "@SuppressWarnings(\"all\")\n"
								+ "\n" + "public class " + clase.getText()
								+ " extends javax.swing.JFrame implements ActionListener, ChangeListener {\n" + "\n"
								+ "	private Point mouseClickPoint;\n" + "\n" + "	public " + clase.getText()
								+ "() {\n" + "\n" + "		getContentPane().setBackground(Color.WHITE);\n" + "\n"
								+ "		setTitle(\"" + titulo.getText() + "\");\n" + "\n" + "		initComponents();\n"
								+ "\n" + "		setUndecorated(true);\n" + "\n"
								+ "		setShape(new RoundRectangle2D.Double(0, 0, 847, 600, 50, 50));\n" + "\n"
								+ "		this.addMouseListener(new MouseAdapter() {\n" + "\n" + "			@Override\n"
								+ "\n" + "			public void mousePressed(MouseEvent e) {\n" + "\n"
								+ "				mouseClickPoint = e.getPoint();\n" + "\n" + "			}\n" + "\n"
								+ "		});\n\n" + "		this.addMouseMotionListener(new MouseAdapter() {\n" + "\n"
								+ "			@Override\n" + "			public void mouseDragged(MouseEvent e) {\n"
								+ "\n" + "				Point newPoint = e.getLocationOnScreen();\n" + "\n"
								+ "				newPoint.translate(-mouseClickPoint.x, -mouseClickPoint.y); // Moves the point by given values from its\n"
								+ "																			// location\n"
								+ "				setLocation(newPoint); // set the new location\n" + "\n"
								+ "			}\n" + "\n" + "		});\n" + "\n" + "		this.setVisible(true);\n\n"
								+ "	}\n" + "\n" + "	public static void main(String[] args) {\n" + "\n"
								+ "		try {\n\n" + "			new " + clase.getText() + "().setVisible(true);\n\n"
								+ "		}\n\n	catch (Exception e) {\n" + "\n" + "		}\n\n" + "	}\n" + "\n"
								+ "	private void initComponents() {\n" + "\n"
								+ "		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);\n" + "\n"
								+ "		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));\n" + "\n"
								+ "		setResizable(false);\n" + "\n"
								+ "		JButton btnNewButton_1 = new JButton(\"\");\n" + "\n"
								+ "		btnNewButton_1.addActionListener(new ActionListener() {\n" + "\n"
								+ "			public void actionPerformed(ActionEvent e) {\n" + "\n"
								+ "				dispose();\n" + "\n" + "			}\n" + "\n" + "		});\n" + "\n"
								+ "		JButton btnNewButton_1_1 = new JButton(\"\");\n" + "\n"
								+ "		btnNewButton_1_1.addActionListener(new ActionListener() {\n" + "\n"
								+ "			public void actionPerformed(ActionEvent e) {\n" + "\n"
								+ "				setState(JFrame.ICONIFIED);\n" + "\n" + "			}\n" + "\n"
								+ "		});\n" + "\n"
								+ "		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());\n"
								+ "		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup()\n"
								+ "				.addContainerGap(616, Short.MAX_VALUE)\n"
								+ "				.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(18)\n"
								+ "				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(101)));\n"
								+ "		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()\n"
								+ "				.addGap(28)\n"
								+ "				.addGroup(layout.createParallelGroup(Alignment.LEADING)\n"
								+ "						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)\n"
								+ "						.addGroup(layout.createSequentialGroup()\n"
								+ "								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 35,\n"
								+ "										GroupLayout.PREFERRED_SIZE)\n"
								+ "								.addPreferredGap(ComponentPlacement.RELATED)))\n"
								+ "				.addGap(531)));\n" + "\n"
								+ "		getContentPane().setLayout(layout);\n" + "\n"
								+ "		setSize(new Dimension(847, 600));\n" + "\n"
								+ "		setLocationRelativeTo(null);\n" + "\n" + "	}\n" + "\n"
								+ "	public void stateChanged(ChangeEvent e) {\n" + "\n" + "	}\n" + "\n"
								+ "	public void actionPerformed(ActionEvent e) {\n" + "\n" + "	}\n\n" + "}\n" + "");

						break;

					}

					break;

				case 1:

					switch (accion.getSelectedIndex()) {

					case 0:
						salida.setText(
								"	public static LinkedList<String> listaSQLite(String api, boolean key, int tipo) {\n"
										+ "\n" + "		LinkedList<String> lista = new LinkedList<String>();\n" + "\n"
										+ "		try {\n" + "\n"
										+ "			PreparedStatement st = connect.prepareStatement(\"SELECT NOMBRE FROM TABLE\");\n"
										+ "\n" + "			result = st.executeQuery();\n" + "\n"
										+ "			while (result.next()) {\n" + "\n"
										+ "				lista.add(result.getString(\"NOMBRE\"));\n" + "			}\n"
										+ "\n" + "		}\n" + "\n" + "		catch (SQLException ex) {\n" + "\n"
										+ "		}\n" + "\n" + "		return lista;\n" + "\n" + "	}");
						break;

					}

					break;

				}

			}

		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(36)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE).addGap(10)
						.addComponent(accion, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(paquete, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(salida, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 172,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(clase, GroupLayout.PREFERRED_SIZE, 172,
												GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(56, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
						.addGroup(
								layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(tipo, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
												.addComponent(accion, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(paquete, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 47,
														Short.MAX_VALUE))
										.addGap(18)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(salida, GroupLayout.PREFERRED_SIZE, 516,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(clase, GroupLayout.PREFERRED_SIZE, 47,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(titulo, GroupLayout.PREFERRED_SIZE, 47,
																GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(30, Short.MAX_VALUE)));

		this.setLayout(layout);

	}
}
