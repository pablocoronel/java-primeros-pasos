import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario = JOptionPane.showInputDialog("Ingrege nombre");

		String edad = JOptionPane.showInputDialog("Ingrese edad");

		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;

		System.out.println("Nombre: " + nombre_usuario + " Edad en pr�ximo a�o: " + edad_usuario);
	}

}
