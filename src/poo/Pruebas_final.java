package poo;

public class Pruebas_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancias
		Empleados trabajador1 = new Empleados("paco");
		Empleados trabajador2 = new Empleados("cacho");
		Empleados trabajador3 = new Empleados("maria");
		Empleados trabajador4 = new Empleados("lisandro");

		// seteo
		trabajador1.setSeccion("rr.hh.");

		// ver en consola
		System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() + "\n" + trabajador3.getDatos() + "\n"
				+ trabajador4.getDatos());

		System.out.println(Empleados.getIdSiguiente());

		// incrementa el atributo estatico
//		Empleados.id++; // se incrementa antes de la 2da instancia, pero no es automatico 
//		System.out.println();
//
//		System.out.println(trabajador3.getDatos());
//		System.out.println(trabajador4.getDatos());
	}

}

//no tiene que ser publica
class Empleados {
	private final String nombre; // con final, es una constante y no se puede modificar
	private String seccion;
	private int id;
	// en cursiva aparece para eclipse los atributos estaticos
	private static int idSiguiente = 1;

	// constructor
	public Empleados(String nom) {
		this.nombre = nom;
		this.seccion = "administracion";

		// al atributo se le asigna el valor de la variable estatica (todas las
		// instancias vana a compartir el atributo, no tienen una copia cada una)
		this.id = this.idSiguiente;
		this.idSiguiente++; // se incrementa la variable estatica para la siguiente instancia
	}

	// setter
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	/// esto no se puede hacer, xq this.nombre es una constante (con final)
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}

	// getter
	public String getDatos() {
		return "El nombre es: " + this.nombre + " y la seccion es: " + this.seccion + " el ID es: " + this.id;
	}

	// metodo estatico
	//para usar este metodo estatico, no se puede usar SOBRE una instancia, sino accediendo desde la clase
	//ej: Clase.miMetodoEstatico();
	public static String getIdSiguiente() {
		// solamante se pueden usar atributos tambien estaticos
		return "El ID siguiente es: " + idSiguiente;
	}
}