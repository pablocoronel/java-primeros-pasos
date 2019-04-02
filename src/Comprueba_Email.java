import javax.swing.JOptionPane;

public class Comprueba_Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba = 0;
		boolean punto = false;

		// guarda lo ingresado desde un cuadro de dialogo
		String email = JOptionPane.showInputDialog("Ingresa el email");

		for (int i = 0; i < email.length(); i++) {
//			string.charAt() es para obtener el caracter de una posicion dada
			if (email.charAt(i) == '@') { // el tipo char se escribe entre COMILLAS SIMPLES
				arroba++;
			}

			if (email.charAt(i) == '.') { // el tipo char se escribe entre COMILLAS SIMPLES
				punto = true;
			}
		}

		if (arroba == 1 && punto == true) {
			System.out.println("El email es correcto");
		} else {
			System.out.println("El email es incorrecto");
		}
	}

}
