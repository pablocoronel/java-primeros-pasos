
public class Manipula_Cadenas_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alumno1, alumno2;

		alumno1 = "David";
		alumno2 = "David";
		String alumno3 = "david";

		// comparacion de strings estricta
		System.out.println(alumno1.equals(alumno2));

		// comparacion sin diferenciar entre mayusculas y minusculas
		System.out.println(alumno1.equalsIgnoreCase(alumno3));
	}

}
