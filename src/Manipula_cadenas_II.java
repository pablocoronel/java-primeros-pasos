
public class Manipula_cadenas_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "Este es un texto largo de ejemplo para substring";

		String resumen = frase.substring(10, 30);

		System.out.println(resumen);

//		uniendo substring con otro string
		System.out.println(frase.substring(0, 10) + " TEXTO UNIDO " + frase.substring(20, 30));
	}

}
