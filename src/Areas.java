import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crea una instancia de Scanner para acceder a lo ingresado por consola
		Scanner entrada = new Scanner(System.in);

		System.out.println("Elije una opcion: \n 1: Cuadrado \n 2: Rectangulo \n 3: Triangulo \n 4: Circulo");

		// accede a la proxima entrada de un entero por consola
		int figura = entrada.nextInt();

		// bloque switch
		switch (figura) {
		case 1:
			// conversion a int desde un String
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El area de un rectangulo es: " + base * altura);
			break;

		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

			System.out.println("El area de un triangulo es: " + (base * altura) / 2);
			break;

		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

			System.out.print("El area de un circulo es:");
			// formateo del texto de salida por consola
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			break;

		default:
			System.out.println("Lo opcion no es correcta");
			break;
		}
	}

}
