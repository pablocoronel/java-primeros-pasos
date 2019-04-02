package poo;

public class Coche {

	//declaracion de atributos
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

	public String getClimatizador() {
		if (this.climatizador == true) {
			return "El coche tiene climatizador";
		} else {
			return "El coche tiene aire acondicionado";
		}
	}

	public String getPesoCoche() {
		int peso_carroceria = 500;
		this.peso_total = peso_plataforma + peso_carroceria;

		if (asientos_cuero) {
			this.peso_total += 50;
		}

		if (climatizador) {
			this.peso_total += 20;
		}

		return "El peso del coche es " + this.peso_total;
	}

	// setters
	public void setColor(String color_coche) {
		color = color_coche;
	}

	public void setAsiento(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public int precio_coche() {
		int precio_final = 10000;

		if (asientos_cuero) {
			precio_final += 2000;
		}

		if (climatizador) {
			precio_final += 1500;
		}

		return precio_final;
	}
}
