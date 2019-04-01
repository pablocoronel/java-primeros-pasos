package poo;

import java.util.Date;
import java.util.GregorianCalendar;

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
//		empleado1.aumentarSueldo(5);
//		empleado2.aumentarSueldo(5);
//		empleado3.aumentarSueldo(5);
//
//		System.out.println("nombre: " + empleado1.getNombre() + " sueldo: " + empleado1.getSueldo() + " fecha de alta: "
//				+ empleado1.getAltaContrato());
//
//		System.out.println("nombre: " + empleado2.getNombre() + " sueldo: " + empleado2.getSueldo() + " fecha de alta: "
//				+ empleado2.getAltaContrato());
//
//		System.out.println("nombre: " + empleado3.getNombre() + " sueldo: " + empleado3.getSueldo() + " fecha de alta: "
//				+ empleado3.getAltaContrato());

		// en un array
		Empleado[] misEmpleados = new Empleado[4];
		misEmpleados[0] = new Empleado("pablo", 10000, 2018, 04, 01);
		misEmpleados[1] = new Empleado("laura", 12000, 2015, 10, 20);
		misEmpleados[2] = new Empleado("carlos", 8000, 2016, 01, 01);
		misEmpleados[3] = new Empleado("pepe");

//		for (int i = 0; i < misEmpleados.length; i++) {
//			misEmpleados[i].aumentarSueldo(5);
//		}

		for (Empleado emp : misEmpleados) {
			emp.aumentarSueldo(5);
		}

//
//		for (int i = 0; i < misEmpleados.length; i++) {
//			System.out.println("nombre: " + misEmpleados[i].getNombre() + " sueldo: " + misEmpleados[i].getSueldo()
//					+ " fecha de alta: " + misEmpleados[i].getAltaContrato());
//		}

		for (Empleado emp : misEmpleados) {
			System.out.println("nombre: " + emp.getNombre() + " sueldo: " + emp.getSueldo() + " fecha de alta: "
					+ emp.getAltaContrato());
		}
	}

}

class Empleado {
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	// constructor
	public Empleado(String nom, double sue, int anho, int mes, int dia) {
		this.nombre = nom;
		this.sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(anho, mes - 1, dia);
		this.altaContrato = calendario.getTime();
	}

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

	public Date getAltaContrato() {
		return this.altaContrato;
	}

	// metodos
	public void aumentarSueldo(double porcentaje) {
		double aumento = this.sueldo * (porcentaje / 100);
		this.sueldo += aumento;
	}
}