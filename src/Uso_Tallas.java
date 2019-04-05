import java.util.Scanner;

public class Uso_Tallas {

	// sin constructor
//	enum Talla {
//		MINI, MEDIANO, GRANDE, MUY_GRANDE
//	};

	// con constructor
	enum Talla {
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

		private String abreviatura;

		// constructor (es private xq los enum no admiten instanciarlos -new-)
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		// getter
		public String getAbreviatura() {
			return this.abreviatura;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sin constructor
//		Talla s = Talla.MINI;
//		Talla m = Talla.MEDIANO;
//		Talla l = Talla.GRANDE;
//		Talla xl = Talla.MUY_GRANDE;

		// con constructor
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI; MEDIANO; GRANDE; MUY_GRANDE");
		String entrada_datos = entrada.next().toUpperCase(); // pasa a mayuscula lo ingresado

		// obtiene la talla segun lo ingresado
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

		System.out.println("Talla: " + la_talla);

		// ver abreviatura
		System.out.println("Abreviatura es igual a " + la_talla.getAbreviatura());
	}

}
