package poo;

public class Pruebas_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("paco");
		Empleados trabajador2 = new Empleados("cacho");

		trabajador1.setSeccion("rr.hh.");

		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos());
	}

}

//no tiene que ser publica
class Empleados {
	private final String nombre; //con final, es una constante y no se puede modificar
	private String seccion;

	// constructor
	public Empleados(String nom) {
		this.nombre = nom;
		this.seccion = "administracion";
	}

	// setter
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	///esto no se puede hacer, xq this.nombre es una constante (con final)
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	// getter
	public String getDatos() {
		return "El nombre es: " + this.nombre + " y la seccion es: " + this.seccion;
	}
}