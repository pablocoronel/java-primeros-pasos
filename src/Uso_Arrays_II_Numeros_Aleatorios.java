
public class Uso_Arrays_II_Numeros_Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaracion de una array
		int[] numeros_aleatorios = new int[100];

		// rellenar el array
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			numeros_aleatorios[i] = (int) Math.round(Math.random() * 100);
		}

		// ver
		for (int elemento : numeros_aleatorios) {
			System.out.print(elemento + " ");
		}
	}

}
