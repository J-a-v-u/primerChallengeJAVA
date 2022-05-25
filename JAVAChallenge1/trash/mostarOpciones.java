package conversor;
import javax.swing.JOptionPane;

public class mostarOpciones {

	public static void main(String[] args) {
		  String[] carreras = {
		            "Ingeniería en sistemas computacionales",
		            "Ingeniería industrial",
		            "Ingeniería en mecatrónica",
		            "Ingeniería en informatica",
		            "Ingeniería petroquímica"
		        };
		        //MyIcon icon = new MyIcon();
		  //String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
		  String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);

	}

}
