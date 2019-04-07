package poo;

// una interface tiene solamente metodos abstractos y constantes
public interface Trabajadores {

	// se puede omitir el public abstract, ya que se sobreentiende que todos los
	// metodos deben ser publicos y abstractos
	double establece_bonus(double gratificacion);

	// se puede omitir el public static final para la constante
	// public (para que se puede acceder)
	// static (porque pertenece a una interface)
	// final (porque es una constante)
	double bonus_base = 1500;
}