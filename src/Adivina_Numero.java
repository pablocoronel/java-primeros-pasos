import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero_a_adivinar = (int) (Math.random() * 100);

//		System.out.println(numero_a_adivinar);

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		int intentos = 0;

		while (numero != numero_a_adivinar) {
			intentos++;
			System.out.println("Introduce un numero");

//			guarda el numero a comparar
			numero = entrada.nextInt();

//			comparaciones
			if (numero_a_adivinar < numero) {
				System.out.println("Más bajo");
			} else if (numero_a_adivinar > numero) {
				System.out.println("Más alto");
			}
		}

		System.out.println("Correcto, logrado en " + intentos + " intentos");
	}

}
