package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_Temporizador_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia de una clase que implementa la interface ActionListener
		DameLaHora oyente = new DameLaHora();

//		ActionListener oyente = new DameLaHora(); esto tambien funciona

		// crea un temporizador
		Timer mi_temporizador = new Timer(5000, oyente);

		// comienza
		mi_temporizador.start();

		// para dejar el programa en ejecucion asi se ve
		JOptionPane.showMessageDialog(null, "pulsa para detener");
	}

}

// clase que se usa como parametro en el temporizador de la clase Prueba_Temporizador
class DameLaHora implements ActionListener {

	// metodo que hay que implementar de la interface
	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date(); // hora actual

		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);

		// emite un sonido del sistema operativo
		Toolkit.getDefaultToolkit().beep();
	}

}