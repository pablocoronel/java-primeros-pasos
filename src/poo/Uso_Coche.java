package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche renault = new Coche();

		// NO se puede acceder a atributos directamente sin son "private", usar getter
//		System.out.println("Este coche tiene " + renault.rueda + " ruedas");

		// usando getter
		System.out.println(renault.getLargo());
		
		//usando setter para modificar atributos
		renault.setColor();
		System.out.println(renault.getColor());
	}

}
