package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaracion del array
		Persona[] lasPersonas = new Persona[2];

		// se pueden agregar dos tipos distintos debido al polimorfismo
		lasPersonas[0] = new Empleado_2("pablo", 20000, 2010, 04, 01);
		lasPersonas[1] = new Alumno("andrea", "abogacia");

		for (Persona p : lasPersonas) {
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
		}
	}
}

//es una clase abstracta porque tiene un metodo abstracto
abstract class Persona {
	private String nombre;

	// constructor
	public Persona(String nom) {
		this.nombre = nom;
	}

	// getter que van a usar todas las clases que heredan
	public String getNombre() {
		return this.nombre;
	}

	public abstract String getDescripcion();
}

// es sin public xq está en un mismo archivo que la clase que tiene el metodo
// main, si estuviera en un archivo aparte puede tener el public
class Empleado_2 extends Persona {
	private double sueldo;
	private Date altaContrato; // uso del tipo Date para fechas
	private int id;
	private static int idSiguiente = 1;

	// constructor
	public Empleado_2(String nom, double sue, int anho, int mes, int dia) {
		super(nom); // se llama al constructor de la clase padre
		this.sueldo = sue;

		// creacionde fecha
		GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
		// obtener la fecha creada
		this.altaContrato = calendario.getTime();

		this.id = this.idSiguiente;
		this.idSiguiente++;
	}

	// getter
	public double getSueldo() {
		return this.sueldo;
	}

	// implementa el metodo abstracto
	public String getDescripcion() {
		return "Este empleado tiene un ID= " + this.id + " con un sueldo= " + this.sueldo;
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

class Alumno extends Persona {
	private String carrera;

	public Alumno(String nom, String carrera) {
		super(nom);
		this.carrera = carrera;
	}

	// implementacion del metodo abstracto
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Este alumno está estudiando la carrera de: " + this.carrera;
	}
}