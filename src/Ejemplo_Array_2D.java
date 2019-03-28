
public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado, interes = 0.10;

		double[][] saldo = new double[6][5];

		// rellenar matriz
		for (int i = 0; i < 6; i++) {
			saldo[i][0] = 10000;
			acumulado = 10000;

			for (int j = 1; j < 5; j++) {
				acumulado = acumulado + (acumulado * interes);
				saldo[i][j] = acumulado;
			}

			interes = interes + 0.01;
		}

		// imprimir
		for (int i = 0; i < saldo.length; i++) {
			System.out.println();

			for (int j = 0; j < saldo[i].length; j++) {
				System.out.printf("%1.2f", saldo[i][j]);
				System.out.print(" ");
			}
		}
	}

}
