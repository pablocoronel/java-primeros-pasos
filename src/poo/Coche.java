package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

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

	public String getDatosGenerales() {
		return "La plataforma del  vehiculo tiene " + ruedas + " ruedas. Mide " + largo / 1000
				+ " metros con unh ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " Kg.";
	}

	public String getAsiento() {
		if (this.asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}

	// setters
	public void setColor(String color_coche) {
		color = color_coche;
	}

	public void setAsiento(String asientos_cuero) {
		if (asientos_cuero == "si") {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
}
