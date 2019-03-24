import java.util.*;

public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingresa la edad");

		int edad = entrada.nextInt();

		if (edad < 18) {
			System.out.println("Sos adolescente");
		} else if (edad < 40) {
			System.out.println("Sos joven");
		} else if (edad < 65) {
			System.out.println("Sos adulto");
		} else {
			System.out.println("Ciudate35");
		}
	}

}
