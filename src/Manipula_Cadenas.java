
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Pablo";

		System.out.println("Mi nombre es " + nombre);

		System.out.println("Mi nmbre tiene " + nombre.length() + " letras");

		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));

		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra - 1));
	}

}
