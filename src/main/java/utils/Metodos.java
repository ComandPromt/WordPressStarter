package utils;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.comboBox.comboSuggestion.ComboBoxSuggestion;
import com.textField.simple.TextField;

import util.Mthos;

public abstract class Metodos {

	public static Connection connect;

	static ResultSet result;

	static PreparedStatement st;

	public static void limpiarTextos(TextField input) {

		input.setText(input.getText().trim());

		input.setText(input.getText().replace("   ", "  "));

		input.setText(input.getText().replace("  ", " "));

	}

	public static Connection conexionBD() {

		try {

			connect = DriverManager.getConnection(
					"jdbc:sqlite:" + new File(".").getCanonicalPath() + Mthos.saberSeparador() + "db.db");

		}

		catch (Exception ex) {

		}

		return connect;

	}

	public static void insertar(String urlBd, String nombreBd, String usuarioBd, String passBd, String prefixBd,
			String nombreWeb, String descripcionWeb, String urlWeb, String nombreUsuario, String passUsuario,
			String emailUsuario) {

		conexionBD();

		String sql = "INSERT INTO BD(NOMBRE,USUARIO,PASS,URL,PREFIJO) VALUES(?,?,?,?,?)";

		try {

			PreparedStatement pstmt = connect.prepareStatement(sql);

			pstmt.setString(1, nombreBd);

			pstmt.setString(2, usuarioBd);

			pstmt.setString(3, passBd);

			pstmt.setString(4, urlBd);

			pstmt.setString(5, prefixBd);

			pstmt.executeUpdate();

			sql = "INSERT INTO WEBS(NOMBRE,DESCRIPCION,URL,BD) VALUES(?,?,?,?)";

			pstmt = connect.prepareStatement(sql);

			pstmt.setString(1, nombreWeb);

			pstmt.setString(2, descripcionWeb);

			pstmt.setString(3, urlWeb);

			String consulta = "SELECT ID FROM BD ORDER BY ID DESC";

			st = connect.prepareStatement(consulta);

			result = st.executeQuery();

			result.next();

			pstmt.setInt(4, Integer.parseInt(result.getString("ID")));

			pstmt.executeUpdate();

			sql = "INSERT INTO USUARIOS(NOMBRE,PASS,EMAIL,WEB) VALUES(?,?,?,?)";

			pstmt = connect.prepareStatement(sql);

			pstmt.setString(1, nombreWeb);

			pstmt.setString(2, passBd);

			pstmt.setString(3, urlWeb);

			consulta = "SELECT ID FROM WEBS ORDER BY ID DESC";

			st = connect.prepareStatement(consulta);

			result = st.executeQuery();

			result.next();

			pstmt.setInt(4, Integer.parseInt(result.getString("ID")));

			pstmt.executeUpdate();

			cerrar();

		}

		catch (Exception e) {

		}

	}

	private static void cerrar() throws SQLException {

		result.close();

		connect.close();

		st.close();

	}

	public static void abrirCarpeta(String ruta) throws IOException {

		if (ruta != null && !ruta.equals("") && !ruta.isEmpty()) {

			try {

				if (System.getProperty("os.name").contains("indow")) {

					Runtime.getRuntime().exec("cmd /c C:\\Windows\\explorer.exe " + "\"" + ruta + "\"");

				}

				else if (System.getProperty("os.name").contains("inux")) {

					Runtime.getRuntime().exec("xdg-open " + ruta);

				}

				else {

					Runtime.getRuntime().exec("open " + ruta);

				}

			}

			catch (IOException e) {

			}

		}

	}

	@SuppressWarnings("unchecked")
	public static void verWebs(@SuppressWarnings("rawtypes") ComboBoxSuggestion web) {

		try {

			conexionBD();

			String consulta = "SELECT NOMBRE FROM WEBS";

			st = connect.prepareStatement(consulta);

			result = st.executeQuery();

			while (result.next()) {

				web.addItem(result.getString("NOMBRE"));

			}

			cerrar();

		}

		catch (Exception e) {

		}

	}

	public static String verUrl(String url) {

		String resultado = "";

		try {

			conexionBD();

			String consulta = "SELECT URL FROM WEBS WHERE NOMBRE='" + url + "'";

			st = connect.prepareStatement(consulta);

			result = st.executeQuery();

			result.next();

			resultado = result.getString("URL");

			cerrar();

			resultado = resultado.substring(0, resultado.indexOf("wp-admin/")) + "wp-login.php";

		}

		catch (Exception e) {

		}

		return resultado;

	}

	public static LinkedList<String> saberCredenciales(String nombre, String url) {

		LinkedList<String> resultado = new LinkedList<>();

		try {

			conexionBD();

			url = url.substring(0, url.lastIndexOf("/") + 1) + "wp-admin/setup-config.php?step=1&language=es_ES";

			String consulta = "SELECT U.NOMBRE,U.PASS FROM USUARIOS U JOIN WEBS W ON U.WEB=W.ID WHERE W.NOMBRE='"
					+ nombre + "' AND URL='" + url + "'";

			st = connect.prepareStatement(consulta);

			result = st.executeQuery();

			result.next();

			resultado.add(result.getString("NOMBRE"));

			resultado.add(result.getString("PASS"));

			cerrar();

		}

		catch (Exception e) {

		}

		return resultado;

	}

}
