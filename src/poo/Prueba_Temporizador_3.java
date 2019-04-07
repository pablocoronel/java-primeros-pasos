package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia del reloj
		Reloj_2 mi_reloj = new Reloj_2();

		// comenzar
		mi_reloj.enMarcha(3000, true);

		// para mentener el programa en ejecucion
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");

		// al leer esta instruccion, se sale el programa
		System.exit(0);
	}

}

class Reloj_2 {

	// tiene que llevar final para que la clase interna local acceda a la variable
	// del metodo donde es declarada
	public void enMarcha(int intervalo, final boolean sonido) {

		// clase interna local, NO lleva modificador de acceso
		// es local porque está adentro de un método, sirve para cuando una clase se va
		// a usar una unica vez
		class DameLaHora_2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();

				System.out.println("Te pongo la hora cada 3 segundos");

				// accede a las variables locales de la clase externa
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}

		}

		ActionListener oyente = new DameLaHora_2();

		Timer mi_temporizador = new Timer(intervalo, oyente);

		mi_temporizador.start();
	}

}