package interfaz;

import javax.swing.JOptionPane;
public class inicio {
	public static void main(String[] args) {
		lista_opciones cambio_moneda = new lista_opciones();
		lista_opciones_metros cambio_unidad = new lista_opciones_metros();
		JOptionPane.showMessageDialog(null, "Bienvenido al programa de conversor");
		String opciones = (JOptionPane.showInputDialog(null, "¿Qué desea Convertir? ", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Metros"}, "Seleccion")).toString();
		if (opciones == "Conversor de Moneda") {
			String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
			boolean valido = esNoNegativo(input);
			while (!valido) {
				int opcion = JOptionPane.showConfirmDialog(null, "El valor que has introducido no es válido. ¿Quieres volver a intentarlo?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				if (opcion == JOptionPane.YES_OPTION) {
					input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
					valido = esNoNegativo(input);
				}
				else {
					System.exit(0);
				}
			}
			double valor = Double.parseDouble(input);
			cambio_moneda.ConvertirMoneda(valor);
		}
		else {
			String input = JOptionPane.showInputDialog("Ingresa la distancia que deseas convertir: ");
			boolean valido = esNoNegativo(input);
			while (!valido) {
				int opcion = JOptionPane.showConfirmDialog(null, "El valor que has introducido no es válido. ¿Quieres volver a intentarlo?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
				if (opcion == JOptionPane.YES_OPTION) {
					input = JOptionPane.showInputDialog("Ingresa la distancia que deseas convertir: ");
					valido = esNoNegativo(input);
				}
				else {
					System.exit(0);
				}
			}
			double valor = Double.parseDouble(input);
			cambio_unidad.ConvertirUnidad(valor);
		}
    }
	public static boolean esNoNegativo(String s) {
		  try {
		    double n = Double.parseDouble(s);
		    if (n >= 0) {
		      return true;
		    }
		    else {
		      return false;
		    }
		  }
		  catch (NumberFormatException e) {
		    return false;
		  }
		}
}
