
package paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.LinkedList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.buttons.simple.SimpleButton;
import com.comboBox.comboSuggestion.ComboBoxSuggestion;

import radio_button.RadioButtonCustom;
import utils.Metodos;

public class pnlChat extends javax.swing.JPanel {

	private ComboBoxSuggestion tipo = new ComboBoxSuggestion();

	private ComboBoxSuggestion accion = new ComboBoxSuggestion();

	private ComboBoxSuggestion web;

	private RadioButtonCustom chrome;

	private RadioButtonCustom firefox;

	private WebDriver driver;

	public pnlChat() {

		initComponents();

	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		setBackground(new java.awt.Color(255, 255, 255));

		SimpleButton btnNewButton = new SimpleButton("Generate");

		btnNewButton.setText("Administrar el sitio web");

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

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

					String url = Metodos.verUrl(web.getSelectedItem().toString());

					driver.get(url);

					LinkedList<String> lista = Metodos.saberCredenciales(web.getSelectedItem().toString(), url);

					driver.findElement(By.id("user_login")).sendKeys(lista.get(0));

					driver.findElement(By.id("user_pass")).sendKeys(lista.get(1));

					driver.findElement(By.id("wp-submit")).click();

				}

				catch (Exception e1) {
					e1.printStackTrace();
				}

			}

		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		web = new ComboBoxSuggestion();

		web.setFont(new Font("Tahoma", Font.PLAIN, 16));

		Metodos.verWebs(web);

		JLabel lblNewLabel_1 = new JLabel("");

		lblNewLabel_1.setIcon(new ImageIcon(pnlChat.class.getResource("/img/chrome.png")));

		firefox = new RadioButtonCustom("Chrome");

		chrome = new RadioButtonCustom("Chrome");

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

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(pnlChat.class.getResource("/img/firefox.png")));

		firefox.setText("Firefox");

		firefox.setFont(new Font("Tahoma", Font.PLAIN, 16));

		SimpleButton btnNewButton_1 = new SimpleButton("Refrescar");
		btnNewButton_1.setBorderColor(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(pnlChat.class.getResource("/img/actualizar.png")));

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Metodos.verWebs(web);

			}

		});

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.LEADING, false).addGroup(layout.createSequentialGroup()
						.addGap(282)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(chrome, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE).addGap(33)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addGap(6).addComponent(firefox, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(64)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 439,
												Short.MAX_VALUE)
										.addComponent(web, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(109)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(web, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(
										btnNewButton_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(28)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(chrome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup().addGap(5).addComponent(firefox,
										GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addGap(30)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		this.setLayout(layout);

	}
}
