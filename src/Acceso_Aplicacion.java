import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "pablo";
		String pass = "";

		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Ingrese la contraseņa");

			//String.equals("asdsa") es para comparar strings
			//es la unica forma de comparar, NO USAR ==
			if (clave.equals(pass) == false) {
				System.out.println("Contraseņa incorrecta");
			}
		}
		
		System.out.println("Contraseņa correcta");
	}

}
