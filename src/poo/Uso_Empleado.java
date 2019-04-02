package poo;

import java.util.Date; // tipo de dato para fechas
import java.util.GregorianCalendar; // creacion de fechas a partir de strings, ints

// clase principal por donde comienza el programa (tiene el metodo main())
public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Con instancias varias
//		Empleado empleado1 = new Empleado("pablo", 10000, 2018, 04, 01);
//
//		Empleado empleado2 = new Empleado("laura", 12000, 2015, 10, 20);
//
//		Empleado empleado3 = new Empleado("carlos", 8000, 2016, 01, 01);
//
		// usa un metodo
//		empleado1.aumentarSueldo(5);
//		empleado2.aumentarSueldo(5);
//		empleado3.aumentarSueldo(5);
//
		// ver en consola
//		System.out.println("nombre: " + empleado1.getNombre() + " sueldo: " + empleado1.getSueldo() + " fecha de alta: "
//				+ empleado1.getAltaContrato());
//
//		System.out.println("nombre: " + empleado2.getNombre() + " sueldo: " + empleado2.getSueldo() + " fecha de alta: "
//				+ empleado2.getAltaContrato());
//
//		System.out.println("nombre: " + empleado3.getNombre() + " sueldo: " + empleado3.getSueldo() + " fecha de alta: "
//				+ empleado3.getAltaContrato());

		/**************************************************************/
		Jefatura jefe_RRHH = new Jefatura("juan", 20000, 2010, 1, 15);
		jefe_RRHH.setIncentivo(2500);

		// en un array
		// instancia de un array de tipo Empleado
		Empleado[] misEmpleados = new Empleado[6];

		// guarda en cada posicion una instancia de la clase Empleado
		misEmpleados[0] = new Empleado("pablo", 10000, 2018, 04, 01);
		misEmpleados[1] = new Empleado("laura", 12000, 2015, 10, 20);
		misEmpleados[2] = new Empleado("carlos", 8000, 2016, 01, 01);
		misEmpleados[3] = new Empleado("pepe");
		misEmpleados[4] = jefe_RRHH; // polimorfismo, principio de sustitucion
		misEmpleados[5] = new Jefatura("carla", 30000, 2005, 05, 10);

		// casteo de objetos
		// asi permite acceder a los metodos y propiedades de la clase hija (jefatura),
		// sino solamente accede a los atributos y metodos de la clase padre (Empleado)
		// xq es el tipo de dato del array
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];

		jefa_finanzas.setIncentivo(5000); // ya tiene acceso al metodo de la subclase Jefatura

//		for (int i = 0; i < misEmpleados.length; i++) {
//			misEmpleados[i].aumentarSueldo(5);
//		}

		// a todos los empleado se le aumenta el sueldo con un metodo
		for (Empleado emp : misEmpleados) {
			emp.aumentarSueldo(5);
		}

//
//		for (int i = 0; i < misEmpleados.length; i++) {
//			System.out.println("nombre: " + misEmpleados[i].getNombre() + " sueldo: " + misEmpleados[i].getSueldo()
//					+ " fecha de alta: " + misEmpleados[i].getAltaContrato());
//		}

		// ver los datod de cada empleado guardado en el array de Empleados
		for (Empleado emp : misEmpleados) {
			// POLIMORFISMO: la variable "emp" se comporta como Empleado o Jefatura segun
			// corresponda

			// Enlazado din�mico: la m�quina virtual de java sabe a c�al m�todo getSueldo
			// llamar en tiempo de ejecuci�n (al de la clase padre o al de la clase hija)
			System.out.println("nombre: " + emp.getNombre() + " sueldo: " + emp.getSueldo() + " fecha de alta: "
					+ emp.getAltaContrato());
		}
	}

}

// clase para crear empleados
class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato; // uso del tipo Date para fechas

	// constructor
	public Empleado(String nom, double sue, int anho, int mes, int dia) {
		this.nombre = nom;
		this.sueldo = sue;

		// creacionde fecha
		GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
		// obtener la fecha creada
		this.altaContrato = calendario.getTime();
	}

	// constructor
	public Empleado(String nom) {
//		solamente recibe un paremetro, el resto se inicia en null (0.0 "" si corresponde)
//		this.nombre = nom;

		// con un parametro y valores por defecto, usando "this"
		this(nom, 30000, 2000, 01, 01);
	}

	// getter
	public String getNombre() {
		return this.nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	// final en un metodo impide que se sobreescriaba en una clase hija
	public final Date getAltaContrato() {
		return this.altaContrato;
	}

	// metodos
	public void aumentarSueldo(double porcentaje) {
		double aumento = this.sueldo * (porcentaje / 100);
		this.sueldo += aumento;
	}
}

// herencia, extiende de la clase EMpleado
//final en la clase impide que a partir de ella se pueda extender
final class Jefatura extends Empleado {
	private double incentivo;

	// constructor
	public Jefatura(String nom, int sue, int anho, int mes, int dia) {
		// llama al constructor de la clase padre, como tiene parametros, hay que
		// pasarlos
		super(nom, sue, anho, mes, dia);
	}

	// setter
	public void setIncentivo(double b) {
		this.incentivo = b;
	}

	// getter
	// sobreescritura de un metodo
	public double getSueldo() {
		double sueldoJefe = super.getSueldo(); // super hace referencia a la clase padre
		return sueldoJefe + this.incentivo; // this hace referencia a la propia clase
	}
}

///clase para mostrar con Final en la clase padre no se puede extender
//class Director extends Jefatura {
//	public Director(String nom, int sue, int anio, int mes, int dia) {
//		super(nom, 2000, 2010, 05, 10);
//	}
//}