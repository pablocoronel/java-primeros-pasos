package poo;

import javax.swing.*;

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
		renault.setColor(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(renault.getColor());

		// usar setter con parametro
		renault.setAsiento(JOptionPane.showInputDialog("tiene asiento"));

		System.out.println(renault.getAsiento());

		renault.setClimatizador(JOptionPane.showInputDialog("tiene climatizador"));
		System.out.println(renault.getClimatizador());

		System.out.println(renault.getPesoCoche());

		System.out.println("El precio del coche es: " + renault.precio_coche());
	}

}
