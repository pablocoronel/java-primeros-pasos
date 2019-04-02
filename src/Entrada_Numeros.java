import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// almacena lo ingresado desde un cuadro de dialogo
		String numero_1 = JOptionPane.showInputDialog("Ingresar un número");

//		convertir a double
		double numero_2 = Double.parseDouble(numero_1);

		System.out.print("La raiz cuadrada de " + numero_2 + "es ");

		// ver formateo de numeros
		System.out.printf("%1.2f", Math.sqrt(numero_2));
	}

}
