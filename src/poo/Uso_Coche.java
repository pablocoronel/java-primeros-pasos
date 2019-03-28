package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche renault = new Coche();

		// NO se puede acceder a atributos directamente sin son "private", usar getter
//		System.out.println("Este coche tiene " + renault.rueda + " ruedas");

		// usando getter
		System.out.println(renault.getLargo());


		System.out.println(renault.getDatosGenerales());
		// usando setter para modificar atributos
		renault.setColor("Rojo");
		System.out.println(renault.getColor());
		
		// usar setter con parametro
		renault.setAsiento("si");
		
		System.out.println(renault.getAsiento());
	}

}
