import java.util.Scanner;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		instancio un objeto Scanner, para la entrada de datos
//		System.in es la entrada por consola
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce tu nombre");

		String nombre= entrada.nextLine();
		
		System.out.println("Introduce edad");
		
		int edad = entrada.nextInt();
		
//		ver datos ingresados
		System.out.println("Usuario: " + nombre + " edad: " + edad);
	}

}
