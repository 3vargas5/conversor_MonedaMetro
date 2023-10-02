package interfaz;
import javax.swing.JOptionPane;

public class lista_opciones {
	public void ConvertirMoneda(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Pesos Colombianos a Dólares", "Pesos Colombianos a Euros",
    					"Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen Japonés",
    					"Pesos Colombianos a Won Surcoreano", "Dólares a Pesos Colombianos",
    					"Euros a Pesos Colombianos", "Libras Esterlinas a Pesos Colombianos",
    					"Yen Japonés a Pesos Colombianos", "Won Surcoreano a Pesos Colombianos"}, 
    			"Seleccion")).toString();
    	switch(opcion) {
        case "Pesos Colombianos a Dólares":
        	convertirMoneda(input,4077.21,"Pesos Colombianos","Dólares");
        	break;
        case "Pesos Colombianos a Euros":
        	convertirMoneda(input,4039.61,"Pesos Colombianos","Euros");
        	break;
        case "Pesos Colombianos a Libras Esterlinas":
        	convertirMoneda(input,4973.00,"Pesos Colombianos","Libras Esterlinas");
        	break;
        case "Pesos Colombianos a Yen Japonés":
        	convertirMoneda(input,27.2906,"Pesos Colombianos","Yen Japonés");
        	break;
        case "Pesos Colombianos a Won Surcoreano":
        	convertirMoneda(input,3.0148,"Pesos Colombianos","Won Surcoreano");
        	break;
        case "Dólares a Pesos Colombianos":
        	convertirMoneda(input,1/4077.21,"Dólares","Pesos Colombianos");
        	break;
        case "Euros a Pesos Colombianos":
        	convertirMoneda(input,1/4039.61,"Euros","Pesos Colombianos");
        	break;
        case "Libras Esterlinas a Pesos Colombianos":
        	convertirMoneda(input,1/4973.00,"Libras Esterlinas","Pesos Colombianos");
        	break;
        case "Yen Japonés a Pesos Colombianos":
        	convertirMoneda(input,1/27.2906,"Yen Japonés","Pesos Colombianos");
        	break;
        case "Won Surcoreano a Pesos Colombianos":
        	convertirMoneda(input,1/3.0148,"Won Surcoreano","Pesos Colombianos");
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
    public void convertirMoneda(double valor, double tasa,String moneda_ida, String moneda_llegada) {
		double resultado = valor / tasa;
		resultado = Math.round (resultado * 10000) / 10000.0;
        JOptionPane.showMessageDialog(null, valor + " " + moneda_ida + " son: " +resultado+ " " + moneda_llegada);
	}

        
}
