package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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