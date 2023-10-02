package interfaz;

import javax.swing.JOptionPane;

public class lista_opciones_metros {
	public void ConvertirUnidad(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Metros a Centímetros", "Metros a Milímetros", "Metros a Decámetros", "Metros a Kilómetros",
    					"Centímetros a Metros", "Milímetros a Metros", "Decámetros a Metros", "Kilómetros a Metros"}, 
    			"Seleccion")).toString();
    	switch(opcion) {
        case "Metros a Centímetros":
        	cambioUnidad(input,1/100.0,"Metros","Centímetros");
        	break;
        case "Metros a Milímetros":
        	cambioUnidad(input,1/1000.0,"Metros","Milímetros");
        	break;
        case "Metros a Decámetros":
        	cambioUnidad(input,10.0,"Metros","Decámetros");
        	break;
        case "Metros a Kilómetros":
        	cambioUnidad(input,1000.0,"Metros","Kilómetros");
        	break;
        case "Centímetros a Metros":
        	cambioUnidad(input,100.0,"Centímetros","Metros");
        	break;
        case "Milímetros a Metros":
        	cambioUnidad(input,1000.0,"Milímetros","Metros");
        	break;
        case "Decámetros a Metros":
        	cambioUnidad(input,1/10.0,"Decámetros","Metros");
        	break;
        case "Kilómetros a Metros":
        	cambioUnidad(input,1/1000.0,"Kilómetros","Metros");
        	break;
        }      
    	int opcion2 = JOptionPane.showConfirmDialog(null, "¿Deseas hacer otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
        if (opcion2 == JOptionPane.YES_OPTION) {
        	inicio.main(null);
        }
        else {
        	JOptionPane.showMessageDialog(null, "Programa Finalizado");
        	System.exit(0);
        }
    }
    public void cambioUnidad(double valor, double tasa,String unidad_ida, String unidad_llegada) {
		double resultado = valor / tasa;
		resultado = Math.round (resultado * 10000.0) / 10000.0;
        JOptionPane.showMessageDialog(null, valor + " " + unidad_ida + " son: " +resultado+ " " + unidad_llegada);
	}
}
