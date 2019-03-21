import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ver formateo de numeros

		String numero_1 = JOptionPane.showInputDialog("Ingresar un número");

//		convertir a double
		double numero_2 = Double.parseDouble(numero_1);

		System.out.print("La raiz cuadrada de " + numero_2 + "es ");
		System.out.printf("%1.2f", Math.sqrt(numero_2));
	}

}
