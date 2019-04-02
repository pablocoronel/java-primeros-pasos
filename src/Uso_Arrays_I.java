
public class Uso_Arrays_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		declaraciones
//		int[] mi_matriz = new int[s5];
//		int mi_matriz_2[] = new int[5]; //tambien puede ser asi

//		inicializacion individual
//		mi_matriz[0] = 9;
//		mi_matriz[1] = -78;
//		mi_matriz[2] = 25;
//		mi_matriz[3] = 14;
//		mi_matriz[4] = 57;

//		declaracion e inicializacion junta
		int[] mi_matriz = { 23, 35, -12, 87, -4, 6 };

//		System.out.println(mi_matriz[0]);

		// recorrer una matriz
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor del indice " + i + " : " + mi_matriz[i]);
		}
	}

}
