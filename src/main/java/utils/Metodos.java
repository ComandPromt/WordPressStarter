package utils;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Metodos {
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

	public static String calcularCampos(String tabla) {

		tabla = tabla.replace(tabla.substring(0, tabla.indexOf("(") + 1), "").trim();

		tabla = tabla.replace(");", "");

		String[] busqueda = tabla.split(",");

		String[] linea;

		String tipo;

		String resultado = "";

		for (String valor : busqueda) {

			valor = valor.trim();

			if (!valor.contains("FOREIGN") && !valor.startsWith("PRIMARY KEY")) {

				linea = valor.split(" ");

				tipo = calcularTipo(lineaString(linea));

				resultado += tipo;

			}

			else {

			}

		}

		return resultado;

	}

	public static String lineaString(String[] linea) {

		String resultado = "";

		for (String valor : linea) {

			resultado += valor + " ";

		}

		resultado = resultado.trim();

		return resultado;

	}

	public static String calcularTipo(String text) {

		String resultado = "";

		try {

			text = text.toUpperCase();

			if (text.contains("PRIMARY KEY")) {
				// y si la clave es integer y es simple
				resultado += "@Id\r\n@GeneratedValue(strategy = GenerationType.IDENTITY)";

			}

			resultado += "@Column(name =\"" + text.substring(0, text.indexOf(" ")).toLowerCase() + "\"";

			if (text.contains("(")) {

				resultado += ",length = " + text.substring(text.indexOf("(") + 1, text.indexOf(")"));

			}

			if (text.contains("DEFAULT")) {

				resultado += ",columnDefinition = \"" + text.substring(text.indexOf(" ") + 1, text.length()) + "\"";

			}

			resultado += ")\r\n";

			if (text.contains("AUTO_INCREMENT")) {

				resultado += "\r\n@GeneratedValue(strategy = GenerationType.AUTO)\r\n";

			}

			if (!text.contains("PRIMARY KEY") && text.contains("NOT NULL")) {

				resultado += "\r\n@NotNull\r\n";

			}

			if (!text.contains("PRIMARY KEY") && !text.contains("DEFAULT") && text.contains("NULL")
					&& !text.contains("NOT NULL")) {

				resultado += "\r\n@Column(nullable = true)\r\n";

			}

			resultado += "\r\nprivate " + saberTipoColumna(text) + "\r\n\r\n";

		}

		catch (Exception e) {

		}

		return resultado;

	}

	public static String saberTipoColumna(String text) {

		String tipo = text.substring(text.indexOf(" ") + 1, text.length());

		String resultado = "";

		resultado = saberNombreTipo(tipo) + " " + text.substring(0, text.indexOf(" ")).toLowerCase() + ";";

		return resultado;

	}

	public static String saberNombreTipo(String tipo) {

		String textoTipo = "";

		if (tipo.contains("VARCHAR") || tipo.contains("VARBINARY") || tipo.contains("TEXT") || tipo.contains("CLOB")) {

			textoTipo = "String";

		} else if (tipo.contains("TINYINT") || tipo.contains("BOOL")) {

			textoTipo = "boolean";

		} else if (tipo.contains("SMALLINT")) {

			textoTipo = "short";

		} else if (tipo.contains("BIT")) {

			textoTipo = "byte";

		} else if (tipo.contains("BIGINT")) {

			textoTipo = "long";

		} else if (tipo.contains("MEDIUMINT") || tipo.contains("INT") || tipo.contains("YEAR")) {

			textoTipo = "int";

		} else if (tipo.contains("FLOAT") || tipo.contains("DEC")) {

			textoTipo = "float";

		}

		else if (tipo.contains("DOUBLE")) {

			textoTipo = "double";

		}

		else if (tipo.contains("CHAR") || tipo.contains("BINARY")) {

			textoTipo = "char";

		}

		else if (tipo.contains("DATE")) {

			textoTipo = "LocalDate";

		}

		else if (tipo.contains("TIME")) {

			textoTipo = "LocalTime";

		} else if (tipo.contains("DATETIME")) {

			textoTipo = "LocalDateTime";

		}

		else if (tipo.contains("TIMESTAMP")) {

			textoTipo = "Instant";

		}

		return textoTipo;

	}

	private static int countOccurrences(String text, String search) {

		int contador = 0;

		while (text.indexOf(search) > -1) {

			text = text.substring(text.indexOf(search) + search.length(), text.length());

			contador++;

		}

		return contador;

	}

	public static ArrayList<String> saberForaneas(int tipo, String text, String busqueda) {

		ArrayList<String> resultado = new ArrayList<>();

		try {

			text = limpiarCadena(text);

			String dato = "";

			String[] filas;

			switch (tipo) {

			default:

			case 1:

				resultado = recorrerOcurrencias(text, 1, countOccurrences(text, "CREATE TABLE"), false);

				break;

			case 2:

				dato = "";

				filas = text.split("\n");

				for (int i = 0; i < filas.length; i++) {

					if (filas[i].contains("PRIMARY KEY,") || filas[i].contains("PRIMARY KEY ")) {

						resultado.add(filas[i].substring(0, filas[i].indexOf(" ")));

					}

					else if (filas[i].contains("PRIMARY KEY(")) {

						filas[i] = filas[i].substring(filas[i].indexOf(busqueda) + busqueda.length()).trim();

						dato = filas[i].substring(0, filas[i].indexOf(")"));

						dato = dato.replace("(", "");

						dato = dato.replace(",", "*");

						resultado.add(dato);

					}

				}

				break;

			case 3:

				dato = "";

				filas = text.split("CREATE TABLE");

				String textoSalida = "";

				for (int i = 0; i < filas.length; i++) {

					if (filas[i].contains("REFERENCES")) {

						dato = filas[i].trim();

						textoSalida = "";

						int hasta = countOccurrences(dato, "REFERENCES");

						for (int y = 0; y < hasta; y++) {

							dato = dato.substring(dato.indexOf("REFERENCES") + 10, dato.length()).trim();

							dato = dato.trim();

							if (!textoSalida.equals("")) {

								textoSalida += "*";

							}

							if (hasta - y == 1) {

								textoSalida += dato.substring(0, dato.indexOf("("));

							}

							else {

								if (dato.contains("(")) {

									textoSalida += dato.substring(0, dato.indexOf("(")).trim();

								}

								else {

									textoSalida += dato;

								}

							}

						}

						resultado.add(textoSalida);

					}

					else if (filas[i].contains("PRIMARY KEY") && !filas[i].contains("REFERENCES")) {

						resultado.add("null");

					}

				}

				break;

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;

	}

	private static ArrayList<String> recorrerOcurrencias(String text, int opcion, int numTablas, boolean atras) {

		String fila = "";

		String[] arrTablas = text.split(";");

		String tablas = text;

		ArrayList<String> resultado = new ArrayList<>();

		String[] filas = tablas.split("\n");

		String busqueda = "";

		switch (opcion) {

		default:
		case 1:

			busqueda = "CREATE TABLE";

			for (int i = 0; i < numTablas; i++) {

				if (arrTablas[i].contains(busqueda)) {

					tablas = tablas.substring(tablas.indexOf(busqueda) + busqueda.length()).trim();

					fila = tablas.substring(0, tablas.indexOf(" "));

					fila = fila.replace("\r", "");

					fila = fila.replace("\n", "");

					fila = fila.replace("))", ")");

					try {

						fila = fila.substring(0, fila.indexOf("(")).trim();

					}

					catch (Exception e) {

					}

					resultado.add(fila);

				}

				else {

					resultado.add(null);

				}

			}

			break;

		case 2:

			if (atras) {

				for (int i = 0; i < filas.length; i++) {

					if (filas[i].contains("PRIMARY KEY,")) {

						resultado.add(filas[i].substring(0, filas[i].indexOf(" ")));

					}

				}

			}

			else {

				for (int i = 0; i < numTablas; i++) {

					tablas = tablas.substring(tablas.indexOf(busqueda) + busqueda.length()).trim();

					fila = tablas.substring(0, tablas.indexOf(")"));

					fila = fila.replace("\r", "");

					fila = fila.replace("\n", "");

					fila = fila.replace("))", ")");

					resultado.add(fila);

				}

			}

			break;
		case 3:
			break;

		}

		return resultado;

	}

	public static String extraerLinea(String text, int opcion) {

		text = text.toUpperCase();

		text = text.replace("KEY (", "KEY(");

		String resultado = "null";

		switch (opcion) {

		default:
		case 1:

			resultado = busquedaString(1, text);

			break;

		case 2:

			resultado = busquedaString(2, text);

			break;

		case 3:

			resultado = busquedaString(3, text);

			break;

		}

//
//				if (foraneas.length > 0) {
//
//					resultado = "";
//
//				}
//
//				for (int i = 0; i < foraneas.length; i++) {
//
//					if (foraneas.length - i == 1) {
//
//						resultado += foraneas[i];
//
//					}
//
//					else {
//
//						resultado += foraneas[i] + ",";
//
//					}
//
//				}

		return resultado;

	}

	private static String busquedaString(int tipo, String text) {

		String busqueda = "";

		switch (tipo) {

		default:

		case 1:

			busqueda = "CREATE TABLE";

			break;

		case 2:

			busqueda = "PRIMARY KEY";

			break;

		case 3:

			busqueda = "REFERENCES";

			break;

		}

		ArrayList<String> tablasReferencia = saberForaneas(tipo, text, busqueda);

		String resultado = "";

		for (int i = 0; i < tablasReferencia.size(); i++) {

			if (tablasReferencia.size() - i == 1) {

				resultado += tablasReferencia.get(i);

			}

			else {

				resultado += tablasReferencia.get(i) + "-";

			}

		}

		return resultado;

	}

	public static String convertirAHibernate(String texto, boolean lombok, boolean jakarta) {

		String resultado = "";

		try {

			texto = texto.toUpperCase();

			String[] tablas = extraerLinea(texto, 1).split("-");

			String[] arrClavesPrimarias = extraerLinea(texto, 2).split("-");

			for (int i = 0; i < arrClavesPrimarias.length; i++) {

				System.out.println("primarias " + arrClavesPrimarias[i]);

			}

			String[] arrClavesForaneas = extraerLinea(texto, 3).split("-");

			for (int i = 0; i < arrClavesForaneas.length; i++) {

				System.out.println("foraneas " + arrClavesForaneas[i]);

			}

			ArrayList<String> clavesPrimarias = new ArrayList<>();

			ArrayList<String> clavesForaneas = new ArrayList<>();

			int indice = 0;

			for (String atributos : tablas) {

				if (indice < arrClavesPrimarias.length) {

					clavesPrimarias.add(arrClavesPrimarias[indice]);
				}

				if (indice < arrClavesForaneas.length) {

					clavesForaneas.add(arrClavesForaneas[indice]);

				}

				atributos = convertirACamelCase(atributos);

				resultado += ponerCabecera(lombok, jakarta);

				resultado += "@Table(name=\"" + atributos + "\")\r\n";

				resultado += "public class " + atributos;

				if (jakarta) {

					resultado += " implements Serializable";

				}

				resultado += "{\r\n";

				if (!arrClavesPrimarias[indice].contains("*")) {

					resultado += "\t@Id\r\n" + "\t@GeneratedValue(strategy = GenerationType.IDENTITY)\r\n"
							+ "    @Column(name = \"id\", nullable = false)";

				}

				else {

					resultado += "\t@EmbeddedId\r\n" + "\tprivate " + atributos + "Id id;";

				}

				if (!arrClavesForaneas[indice].equals("null")) {

					System.out.println("split " + arrClavesForaneas[indice]);

					String[] indicesForaneas = arrClavesForaneas[indice].split("\\*");

					// Comprobar si es relacionNm

//					for (int i = 0; i < indicesForaneas.length; i++) {
//
//						resultado += "\r\n\t@ManyToOne\r\n\tprivate " + convertirACamelCase(indicesForaneas[i]).trim()
//								+ " " + indicesForaneas[i].toLowerCase().trim() + ";";
//
//					}

				}

				// busqueda = "CREATE TABLE";

//					if (tieneClaveCompuesta(valor) && tieneRelacionNm()) {
//
//						tablasNm.add(ponerCabecera(lombok, jakarta));
//
//
//					}
//
//					else {
//
//						if (!tablasNm.isEmpty()) {
//
//							// resultado += "@IdClass(" + tabla + "Id" + ".class)\r\n\r\n";
//
//						}
//
//						else {
//
//						}

//					}

//
//					resultado += calcularCampos(texto);

//				for (String atributo : campos) {
//
//					if (clavesForaneas.contains(texto.toLowerCase()) || clavesForaneas.contains(texto.toUpperCase())) {
//
//						//tablasNm.add("\r\nprivate " + texto + " " + texto.toLowerCase());
//
//					}
//
//					else {
//
//						//tablasNm.add("private");
//
//					}
//
//				}

				// resultado += "}\n\n";
				indice++;
			}

//			for (String primarysKeys : clavesPrimarias) {
//
//				if (clavesForaneas.contains(primarysKeys.toLowerCase())
//						|| clavesForaneas.contains(primarysKeys.toUpperCase())) {
//
//				}
//
//				tablasNm.add(busqueda);
//
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultado;

	}

	private static String sacarForaneas(String[] cadena) {
		String resultado = "";
		if (cadena.length > 0) {

			try {

				for (int i = 0; i < cadena.length; i++) {

					resultado += "\r\n\t@ManyToOne(fetch = FetchType.LAZY, optional = false)";

					resultado += "\r\n\t" + convertirACamelCase(cadena[i]) + " " + cadena[i].toLowerCase() + ";";

				}

			}

			catch (Exception e) {

			}
		}
		return resultado;

	}

	public static boolean tieneRelacionNm() {

		return false;

	}

	public static String ponerCabecera(boolean lombok, boolean jakarta) {

		String resultado;

		if (jakarta) {

			resultado = "import jakarta.persistence.*;\r\n";

		}

		else {
			resultado = "import javax.persistence.*;\r\n";
		}

		if (lombok) {

			resultado += "import lombok.Getter;\r\n"
					+ "import lombok.Setter;\r\nimport lombok.NoArgsConstructor;\r\n\r\n" + "@Getter\r\n"
					+ "@Setter\r\n" + "@NoArgsConstructor\r\n";

		}

		resultado += "\r\n@Entity\r\n";

		return resultado;

	}

	public static String convertirACamelCase(String text) {

		String resultado = "";

		try {

			resultado = Character.toString(text.charAt(0)).toUpperCase() + text.toLowerCase().substring(1);

		}

		catch (Exception e) {

		}

		return resultado;

	}

	public static String limpiarCadena(String text) {

		text = text.trim();

		text = text.replace("   ", "  ");

		text = text.replace("  ", " ");

		return text;

	}

	public static String limpiarSQL(String texto) {

		String resultado;

		resultado = Metodos.limpiarBuscandoPorString(texto, "DROP DATABASE");

		resultado = Metodos.limpiarBuscandoPorString(texto, "USE");

		resultado = Metodos.limpiarBuscandoPorString(texto, "CREATE VIEW");

		resultado = Metodos.limpiarBuscandoPorString(texto, "CREATE OR REPLACE VIEW");

		resultado = Metodos.limpiarBuscandoPorString(texto, "INSERT");

		return resultado;

	}

	public static String limpiarBuscandoPorString(String texto, String busqueda) {

		String copia = texto;

		boolean error = false;

		if (copia.contains(busqueda)) {

			texto = texto.replace(texto.substring(buscarPrimeraLinea(texto, busqueda), texto.indexOf(busqueda) +

					texto.substring(texto.indexOf(busqueda), texto.length()).indexOf(";") + 1), "").trim();

			while (!error) {

				try {

					while (!copia.substring(0, copia.indexOf(";") + 1).contains(busqueda)) {

						copia = copia.substring(copia.indexOf(";") + 1, copia.length());

					}

					texto = texto.replace(copia.substring(0, copia.indexOf(";") + 1).trim(), "");

					if (texto.contains(busqueda)) {

						copia = copia.substring(copia.indexOf(";") + 1, copia.length());

					}

					else {

						error = true;

					}

				}

				catch (Exception e) {

				}

			}

		}

		texto = texto.trim();

		texto = texto.replace("   ", "  ");

		texto = texto.replace("  ", " ");

		texto = texto.replace("\r\n", "\n");

		texto = texto.replace("\n\n", "\n");

		texto = texto.replace("\r\n", "");

		return texto;

	}

	public static int buscarPrimeraLinea(String texto, String busqueda) {

		int index = texto.indexOf(busqueda);

		int restar = 0;

		if (index > 0) {

			char caracter = texto.charAt(index);

			int i = index;

			while (i >= 0 && caracter != ';') {

				restar++;

				i--;

				caracter = texto.charAt(i);

			}

			restar--;

		}

		return index - restar;

	}

}
