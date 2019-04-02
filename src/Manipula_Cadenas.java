
public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Pablo";

		// concatenacion
		System.out.println("Mi nombre es " + nombre);

		// obtiene el largo de una cadena
		System.out.println("Mi nmbre tiene " + nombre.length() + " letras");

		// con charAt() se obtiene el caracter de una posicion dada en el string
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));

		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra - 1));
	}

}
