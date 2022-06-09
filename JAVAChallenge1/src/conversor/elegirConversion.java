package conversor;
import javax.swing.JOptionPane;


public class elegirConversion {


	public static void main(String[] args) {
		
		  String[] elegirConversor = {
		            "conversor de divisas",
		            "otro conversor"
		        };
		        //MyIcon icon = new MyIcon();
		  //String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
		  String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Bienvenido/a", JOptionPane.DEFAULT_OPTION, null, elegirConversor, elegirConversor[0]);
		  
		  if(resp == "conversor de divisas") {
			  System.out.println("primer opcion");
			  input valor = new input();
			  valor.elegirMoneda();
		  }else if(resp == "otro conversor"){
			  System.out.println("3");
			  JOptionPane.showMessageDialog(null, "Próximamente!");//<-------------------------------------------
		  };
	}

	/*private static void convertirPesosADolares() {		
				String cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir");
				JOptionPane.showMessageDialog(null, "La cantidad "+ cantidad +" en pesos equivale a " + Double.parseDouble(cantidad)/203 + " en dólares.");
			}
		
	*/	
}

