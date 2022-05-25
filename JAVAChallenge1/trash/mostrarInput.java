package conversor;
import javax.swing.JOptionPane;

public class mostrarInput {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}