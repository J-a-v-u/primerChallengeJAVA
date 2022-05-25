package conversor;
import javax.swing.JOptionPane;

public class preguntarCerrar {

	public static void main(String[] args) {
		int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Quieres salir del programa?", "Javadesde0.com", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		//0=yes, 1=no, 2=cancel
		if(ventanaYesNotCancel == 0) {
		  System.out.println("Has pulsado Yes");
		}else if(ventanaYesNotCancel == 1){
		  System.out.println("Has pulsado No");
		}else if(ventanaYesNotCancel == 2){
		  System.out.println("Has pulsado Cancel");
		} 
	}
}