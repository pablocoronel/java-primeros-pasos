package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia del reloj
		Reloj mi_reloj = new Reloj(3000, true);

		// comenzar
		mi_reloj.enMarcha();

		// para mentener el programa en ejecucion
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");

		// al leer esta instruccion, se sale el programa
		System.exit(0);
	}

}

class Reloj {
	private int intervalo;
	private boolean sonido;

	// constructor
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}

	// inicio
	public void enMarcha() {
		ActionListener oyente = new DameLaHora_2();

		Timer mi_temporizador = new Timer(intervalo, oyente);

		mi_temporizador.start();
	}

	// clase interna tiene modificador private, las clase normales solo tiene public
	// o default (vacio)
	private class DameLaHora_2 implements ActionListener {

		// metedo de la interface
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			Date ahora = new Date();

			System.out.println("Te pongo la hora cada 3 segundos");

			// emite el sonido si es true
			// COMO ES UNA CLASE INTERNA se puede acceder a la variable sonido de la clase
			// Reloj (externa), aunque dicha variable esté encapsula (private), se ahorra
			// tener que crear los setters y getters de la clase externa para usarlos
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}

	}

}