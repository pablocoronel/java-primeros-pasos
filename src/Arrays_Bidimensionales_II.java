
public class Arrays_Bidimensionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 10, 15, 2, 74, 5 }, { 48, 12, -7, 98, 50 }, { 88, 26, 97, 45, 11 },
				{ 6, 91, 24, 37, 20 } };

//		for (int i = 0; i < 4; i++) {
//			System.out.println();
//			for (int j = 0; j < 5; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//		}

//		con foreach
		for (int[] fila : matrix) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}
		}
	}

}
