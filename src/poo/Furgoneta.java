package poo;

public class Furgoneta extends Coche {
	private int capacidad_carga;
	private int plazas_extra;

	// constructor
	public Furgoneta(int capacidad_carga, int plazas_extra) {
		super();// llama al constructor de la clase padre para darle un estado inicial a la
				// clase padre
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}

}
