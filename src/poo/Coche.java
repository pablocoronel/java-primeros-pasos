package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;

	int peso_total;
	boolean asientos_cuero, climatizador;

	// constructor
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	// getters
	public String getLargo() {
		return "El largo del coche es " + this.largo;
	}

	public String getColor() {
		return "El color del coche es " + color;
	}

	// setters
	public void setColor() {
		color = "Azul";
	}
}
