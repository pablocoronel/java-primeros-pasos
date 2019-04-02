package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCoche1 = new Coche();

		miCoche1.setColor("verde");

		Furgoneta miFurgoneta1 = new Furgoneta(500, 2);
		
		// heredado de Coche
		miFurgoneta1.setColor("azul");
		miFurgoneta1.setAsiento("si");
		miFurgoneta1.setClimatizador("si");

		System.out.println(miCoche1.getDatosGenerales() + " " + miCoche1.getColor());
		System.out.println(miFurgoneta1.getDatosGenerales() + " " + miFurgoneta1.getDatosFurgoneta());
	}

}
