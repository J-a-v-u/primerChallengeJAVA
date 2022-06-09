package conversor;

import javax.swing.JOptionPane;


public class input {

	public double cantidad;
	public String tipoMoneda;

	public void elegirMoneda() {

		String[] convertirMoneda = {
				"Pesos a dólares",
				"Dólares a pesos",
				"Pesos a Won Koreano"
		};
		//MyIcon icon = new MyIcon();
		//String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
		String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un conversor", "Bienvenido/a", JOptionPane.DEFAULT_OPTION, null, convertirMoneda, convertirMoneda[0]);

		if(resp == "Pesos a dólares") {
			System.out.println("primer opcion");
			input valor = new input();
			valor.convertirPesosADolares();
		}else if(resp == "Dólares a pesos"){
			System.out.println("2");
			input valor = new input();
			valor.convertirDolaresAPesos();
		}else if(resp == "Pesos a Won Koreano"){
			System.out.println("3");
			input valor = new input();
			valor.convertirPesosAWon();
			//JOptionPane.showMessageDialog(null, "Próximamente!");
		};




	}


	//-----------------------------PESOS A DOLARES-----------------------------


	public void convertirPesosADolares() {

		String valorIntroducido = JOptionPane.showInputDialog("Ingrese el monto a convertir");

		//comprobacion que es parseable a un numero y el campo no esta vacio
		try {

			this.cantidad = Double.parseDouble(valorIntroducido);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Este campo sólo admite números positivos y no puede estar vacío!", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirPesosADolares();
			}

		}

		//comprobacion que es un numero positivo
		//JOptionPane.showMessageDialog(null, "La cantidad "+ cantidad +" en dólares equivale a " + cantidad*203 + " en pesos.");
		if(cantidad>=0){		
			String[] options = {"Desea realizar otra conversión?", "Salir", "Cancelar"};
			int seleccion = JOptionPane.showOptionDialog(null, "La cantidad "+ cantidad +" en pesos equivale a " + cantidad/203 + " en dólares.", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				System.out.println("Has pulsado si");
				elegirConversion.main (null);
			}else if(seleccion == 1){
				System.out.println("Has pulsado salir");
			}else if(seleccion == 2){
				System.out.println("Has pulsado Cancel");
			} 
		}else {
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Sólo se permiten números positivos!", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirPesosADolares();
			}
		}

	}


	//-------------------DOLARES A PESOS-----------------------------

	public void convertirDolaresAPesos() {
		String valorIntroducido = JOptionPane.showInputDialog("Ingrese el monto a convertir");

		//comprobacion que es parseable a un numero y el campo no esta vacio
		try {

			this.cantidad = Double.parseDouble(valorIntroducido);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Este campo sólo admite números positivos y no puede estar vacío!", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirDolaresAPesos();
			}

		}

		//comprobacion que es un numero positivo
		//JOptionPane.showMessageDialog(null, "La cantidad "+ cantidad +" en dólares equivale a " + cantidad*203 + " en pesos.");
		if(cantidad>=0){		
			String[] options = {"Desea realizar otra conversión?", "Salir", "Cancelar"};
			int seleccion = JOptionPane.showOptionDialog(null, "La cantidad "+ cantidad +" en dólares equivale a " + cantidad*203 + " en pesos.", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				System.out.println("Has pulsado si");
				elegirConversion.main (null);
			}else if(seleccion == 1){
				System.out.println("Has pulsado salir");
			}else if(seleccion == 2){
				System.out.println("Has pulsado Cancel");
			} 
		}else {
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Sólo se permiten números positivos!", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirDolaresAPesos();
			}
		}

	}





	//-------------------PESOS A WON-----------------------------

	public void convertirPesosAWon() {
		String valorIntroducido = JOptionPane.showInputDialog("Ingrese el monto a convertir");

		//comprobacion que es parseable a un numero y el campo no esta vacio
		try {

			this.cantidad = Double.parseDouble(valorIntroducido);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Este campo sólo admite números positivos y no puede estar vacío!", "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirPesosAWon();
			}

		}
		if(cantidad>=0){		
			String[] options = {"Desea realizar otra conversión?", "Salir", "Cancelar"};
			int seleccion = JOptionPane.showOptionDialog(null, "La cantidad "+ cantidad +" en pesos equivale a " + cantidad*0.097 + " en wones.", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				System.out.println("Has pulsado si");
				elegirConversion.main (null);
			}else if(seleccion == 1){
				System.out.println("Has pulsado salir");
			}else if(seleccion == 2){
				System.out.println("Has pulsado Cancel");
			} 
		}else {
			String[] options = {"Ok!"};
			int seleccion = JOptionPane.showOptionDialog(null, "Sólo se permiten números positivos!", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			if(seleccion == 0) {
				convertirPesosAWon();
			}
		}

	}

}












