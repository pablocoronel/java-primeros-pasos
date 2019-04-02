import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long resultado = 1; // tipo entero superior a int
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));

		// for con decremento
		for (int i = numero; i > 0; i--) {
			resultado = resultado * i;
		}

		System.out.println("El fatorial de " + numero + " es " + resultado);
	}

}
