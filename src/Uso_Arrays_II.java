import javax.swing.JOptionPane;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] paises = new String[8];

		paises[0] = "Argentina";
		paises[1] = "España";
		paises[2] = "Holanda";
		paises[3] = "Francia";
		paises[4] = "Colombia";
		paises[5] = "Estados Unidos";
		paises[6] = "Polonia";
		paises[7] = "Chipre";

		// con for normal
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i + 1) + ": " + paises[i]);
		}
		
		System.out.println("con foreach:");

		// con foreach
		int contador = 0;
		for (String cada_pais : paises) {
			contador++;
			System.out.println("Pais " + contador + ": " + cada_pais);
		}
		
//		************************************************
		//con ingreso de texto
		System.out.println("con ingreso de texto");
		String[] paises_arabes= new String[5];
		for (int i = 0; i < paises_arabes.length; i++) {
			paises_arabes[i]= JOptionPane.showInputDialog("Ingrese un país arabe");
		}
		
		for (String elemento: paises_arabes) {
			System.out.println(elemento);
		}
	}

}
