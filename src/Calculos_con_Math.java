
public class Calculos_con_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	raiz cuadarada
		double raiz = Math.sqrt(9);
		
		System.out.println(raiz);
		
//		redondeo
		double num1 = 5.85;
		int resultado = (int) Math.round(num1);
		
		System.out.println(resultado);
		
//		 potencia con Math.pow()
		
		double base = 5, exponente = 3;
		
		double resultadoPotencia = Math.pow(base, exponente);
		
		System.out.println(resultadoPotencia);
	}

}
