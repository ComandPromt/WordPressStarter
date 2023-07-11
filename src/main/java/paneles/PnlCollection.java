package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.time.LocalDateTime;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;

import com.buttons.simple.SimpleButton;
import com.textField.simple.PasswordField;
import com.textField.simple.TextField;

import radio_button.RadioButtonCustom;
import utils.Metodos;

public class PnlCollection extends javax.swing.JPanel {

	private TextField bd;

	private TextField usuario;

	private JLabel lblNombreDeUsuario;

	private JLabel lblNombreDeUsuario_1;

	private RadioButtonCustom chrome;

	private RadioButtonCustom firefox;

	private TextField url;

	private TextField servidor;

	private PasswordField pass;

	private TextField prefix;

	private JLabel lblTituloDelSitio;

	private JLabel labelEmail;

	private TextField email;

	private TextField sitio;

	private TextField nombreUsuario;

	private PasswordField passAcceso;

	private WebDriver driver;

	private SimpleButton btnNewButton_1;

	public PnlCollection() {

		initComponents();

	}

	private void limpiar() {

		Metodos.limpiarTextos(url);

		Metodos.limpiarTextos(bd);

		Metodos.limpiarTextos(usuario);

		pass.setText(pass.getText().trim());

		Metodos.limpiarTextos(servidor);

		Metodos.limpiarTextos(prefix);

		Metodos.limpiarTextos(sitio);

		Metodos.limpiarTextos(nombreUsuario);

		Metodos.limpiarTextos(email);

		passAcceso.setText(passAcceso.getText().trim());

	}

	public void captureScreen() {

		try {

			WebDriver webDriver = new Augmenter().augment(driver);

			File source = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

			LocalDateTime hoy = LocalDateTime.now();

			String path = new File(".").getCanonicalPath() + "\\screenshots\\" + hoy.getYear() + "_"
					+ hoy.getMonthValue() + "_" + hoy.getDayOfMonth() + "-" + hoy.getHour() + "-" + hoy.getMinute()
					+ "-" + hoy.getSecond() + ".png";

			FileUtils.copyFile(source, new File(path));

		}

		catch (Exception e) {

		}

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		try {

			new File(new File(".").getCanonicalPath() + "\\screenshots").mkdir();

		}

		catch (Exception e) {

		}

		setBackground(new java.awt.Color(255, 255, 255));

		bd = new TextField();
		bd.setHorizontalAlignment(SwingConstants.CENTER);
		bd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bd.setBackground(new Color(238, 238, 238));
		bd.setToolTipText("");
		bd.setColumns(10);

		usuario = new TextField();
		usuario.setHorizontalAlignment(SwingConstants.CENTER);
		usuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		usuario.setBackground(new Color(238, 238, 238));
		usuario.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nombre de la base de datos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblNombreDeUsuario_1 = new JLabel("Contraseña de la base de datos");
		lblNombreDeUsuario_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		pass = new PasswordField();
		pass.setHorizontalAlignment(SwingConstants.CENTER);
		pass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass.setBackground(new Color(238, 238, 238));
		pass.setLabelText("");
		pass.setColumns(10);

		JLabel lblServidorDeLa = new JLabel("Servidor de la base de datos");

		lblServidorDeLa.setHorizontalAlignment(SwingConstants.CENTER);

		lblServidorDeLa.setFont(new Font("Tahoma", Font.PLAIN, 20));

		servidor = new TextField();
		servidor.setText("localhost");

		servidor.setHorizontalAlignment(SwingConstants.CENTER);

		servidor.setFont(new Font("Tahoma", Font.PLAIN, 16));

		servidor.setBackground(new Color(238, 238, 238));

		servidor.setColumns(10);

		JLabel lblPrefijoDeTabla = new JLabel("Prefijo de tabla");

		lblPrefijoDeTabla.setHorizontalAlignment(SwingConstants.CENTER);

		lblPrefijoDeTabla.setFont(new Font("Tahoma", Font.PLAIN, 20));

		prefix = new TextField();
		prefix.setText("wp_");

		prefix.setHorizontalAlignment(SwingConstants.CENTER);

		prefix.setFont(new Font("Tahoma", Font.PLAIN, 16));

		prefix.setBackground(new Color(238, 238, 238));

		prefix.setColumns(10);

		SimpleButton btnNewButton = new SimpleButton("Instalar");

		btnNewButton.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				try {

					limpiar();

					Metodos.insertar(servidor.getText(), bd.getText(), usuario.getText(), pass.getText(),
							prefix.getText(), sitio.getText(), "", url.getText(), nombreUsuario.getText(),
							passAcceso.getText(), email.getText());

					if (chrome.isSelected()) {

						System.setProperty("webdriver.chrome.driver",
								new File(".").getCanonicalPath() + "\\geckodriver\\chromedriver.exe");

						driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

					}

					else {

						System.setProperty("webdriver.gecko.driver",
								new File(".").getCanonicalPath() + "\\geckodriver\\geckodriver.exe");

						driver = new FirefoxDriver();

					}

					JavascriptExecutor js = (JavascriptExecutor) driver;

					driver.get(url.getText());

					try {

						if (driver.findElements(By.className("button")).get(0).getText().equals("¡Vamos a ello!")) {

							driver.findElements(By.className("button")).get(0).click();

							esperar(driver);

						}

					}

					catch (Exception e1) {

					}

					try {

						js.executeScript("document.getElementById('dbhost').value='';");

						js.executeScript("document.getElementById('prefix').value='';");

						driver.findElement(By.id("dbname")).sendKeys(bd.getText());

						driver.findElement(By.id("uname")).sendKeys(usuario.getText());

						driver.findElement(By.id("pwd")).sendKeys(pass.getText());

						driver.findElement(By.id("dbhost")).sendKeys(servidor.getText());

						driver.findElement(By.id("prefix")).sendKeys(prefix.getText());

						driver.findElements(By.className("button")).get(0).click();

						esperar(driver);

						try {

							driver.findElements(By.className("button")).get(0).click();

							esperar(driver);

						} catch (Exception e1) {

							driver.get(url.getText().substring(0, url.getText().indexOf("/wp-admin/"))
									+ "/wp-admin/install.php?language=es_ES");

						}

					}

					catch (Exception e2) {

						driver.get(url.getText().substring(0, url.getText().indexOf("/wp-admin/"))
								+ "/wp-admin/install.php?language=es_ES");

					}

					if (!passAcceso.getText().isEmpty()) {

						js.executeScript("document.getElementById('pass1').value='" + passAcceso.getText() + "';");

					}

					driver.findElement(By.id("weblog_title")).sendKeys(sitio.getText());

					driver.findElement(By.id("user_login")).sendKeys(nombreUsuario.getText());

					driver.findElement(By.id("admin_email")).sendKeys(email.getText());

				}

				catch (Exception e1) {

				}

			}

			private void esperar(WebDriver driver) throws InterruptedException {

				try {

					driver.wait(500);

					Thread.sleep(500);

				}

				catch (Exception e) {

				}

			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));

		JLabel lblUrl = new JLabel("URL");
		lblUrl.setHorizontalAlignment(SwingConstants.CENTER);
		lblUrl.setFont(new Font("Tahoma", Font.PLAIN, 20));

		url = new TextField();
		url.setText("/wp-admin/setup-config.php?step=1&language=es_ES");
		url.setHorizontalAlignment(SwingConstants.CENTER);
		url.setFont(new Font("Tahoma", Font.PLAIN, 16));
		url.setColumns(10);
		url.setBackground(new Color(238, 238, 238));

		chrome = new RadioButtonCustom("Chrome");

		firefox = new RadioButtonCustom("Chrome");

		firefox.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseReleased(MouseEvent e) {

				if (firefox.isSelected()) {

					chrome.setSelected(false);

					firefox.setSelected(true);

				}

				else {

					if (!chrome.isSelected() && !firefox.isSelected()) {

						firefox.setSelected(true);

					}

					chrome.setSelected(false);

				}

			}
		});

		chrome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				if (firefox.isSelected()) {

					firefox.setSelected(false);

					chrome.setSelected(true);

				}

				else {

					if (!chrome.isSelected() && !firefox.isSelected()) {

						chrome.setSelected(true);

					}

					firefox.setSelected(false);

				}

			}

		});

		chrome.setSelected(true);
		chrome.setFont(new Font("Tahoma", Font.PLAIN, 16));

		firefox.setText("Firefox");
		firefox.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PnlCollection.class.getResource("/img/chrome.png")));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PnlCollection.class.getResource("/img/firefox.png")));

		lblTituloDelSitio = new JLabel("Titulo del sitio");
		lblTituloDelSitio.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDelSitio.setFont(new Font("Tahoma", Font.PLAIN, 20));

		sitio = new TextField();
		sitio.setHorizontalAlignment(SwingConstants.CENTER);
		sitio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sitio.setColumns(10);
		sitio.setBackground(new Color(238, 238, 238));

		JLabel lblNombreDeUsuario_2 = new JLabel("Nombre de usuario");
		lblNombreDeUsuario_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario_2.setFont(new Font("Tahoma", Font.PLAIN, 20));

		nombreUsuario = new TextField();
		nombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		nombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nombreUsuario.setColumns(10);
		nombreUsuario.setBackground(new Color(238, 238, 238));

		labelEmail = new JLabel("Correo electrónico");
		labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));

		email = new TextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBackground(new Color(238, 238, 238));

		JLabel lblNombreDeUsuario_2_1 = new JLabel("Contraseña de acceso");
		lblNombreDeUsuario_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));

		passAcceso = new PasswordField();
		passAcceso.setLabelText("");
		passAcceso.setHorizontalAlignment(SwingConstants.CENTER);
		passAcceso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passAcceso.setColumns(10);
		passAcceso.setBackground(new Color(238, 238, 238));

		SimpleButton smplbtnCaptura = new SimpleButton("Instalar");
		smplbtnCaptura.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				captureScreen();

			}

		});
		smplbtnCaptura.setText("Captura");
		smplbtnCaptura.setFont(new Font("Tahoma", Font.PLAIN, 26));

		btnNewButton_1 = new SimpleButton("Parar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1.setBorderColor(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					driver.quit();

				}

				catch (Exception e1) {

				}

			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGap(59)
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblServidorDeLa, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addGroup(layout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombreDeUsuario, GroupLayout.DEFAULT_SIZE, 479,
												Short.MAX_VALUE)
										.addComponent(usuario, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup().addGap(14).addComponent(lblUrl,
												GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
										.addComponent(url, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE))
										.addGap(11))
								.addComponent(servidor, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 481,
										GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 339,
														Short.MAX_VALUE)
												.addGap(227))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(Alignment.TRAILING)
												.addComponent(prefix, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320,
														Short.MAX_VALUE)
												.addComponent(bd, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
												.addComponent(pass, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320,
														Short.MAX_VALUE)
												.addComponent(lblPrefijoDeTabla, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
												.addComponent(lblNombreDeUsuario_1, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
												.addGap(246))))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTituloDelSitio, GroupLayout.PREFERRED_SIZE, 490,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(sitio, GroupLayout.PREFERRED_SIZE, 481,
												GroupLayout.PREFERRED_SIZE))
								.addGap(16)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNombreDeUsuario_2, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(nombreUsuario, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
								.addGap(248)))
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(email, GroupLayout.PREFERRED_SIZE, 481,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 490,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNombreDeUsuario_2_1, GroupLayout.PREFERRED_SIZE, 320,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(passAcceso, GroupLayout.PREFERRED_SIZE, 320,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup().addGap(71)
												.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 76,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(smplbtnCaptura, GroupLayout.PREFERRED_SIZE, 155,
														GroupLayout.PREFERRED_SIZE)))
								.addGap(246))))
				.addGroup(layout.createSequentialGroup().addGap(113).addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(chrome, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE).addGap(33)
						.addComponent(lblNewLabel_2).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(firefox, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE).addGap(59)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(513, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addGap(18)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(lblUrl, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(bd, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(url, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
						.addGap(31)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombreDeUsuario, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombreDeUsuario_1, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGap(11)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(usuario, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(pass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(26)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrefijoDeTabla, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblServidorDeLa, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addGap(27)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(servidor, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(prefix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(47)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTituloDelSitio, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombreDeUsuario_2, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addComponent(sitio, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGap(27)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
										.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNombreDeUsuario_2_1, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)))
								.addComponent(nombreUsuario, GroupLayout.PREFERRED_SIZE, 45,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(email, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addComponent(passAcceso, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(layout
								.createSequentialGroup().addGap(65)
								.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_1)
										.addComponent(
												chrome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(44)
										.addGroup(layout.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(firefox, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(smplbtnCaptura, GroupLayout.PREFERRED_SIZE, 73,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(45).addComponent(btnNewButton_1,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGap(148)));
		this.setLayout(layout);
		
	}
	
}
