package poo;

public class Clase_1 {
//	PUBLIC:      SI: propia clase, paquete propio, subclase, otro paquete u otra clase
//	PROTECTED:   SI: propia clase, paquete propio, subclase
//	POR DEFECTO: SI: propia clase, paquete propio
//  PRIVATE:     SI: propia clase

//  DETALLE:
//  PROTECTED:           SI: subclase aunque esté en otro paquete
//	POR DEFECTO (VACIO): NO: en otro paquete

	// con protected es visible en la clase propia, en la heredada y tamben en la
	// heredada auqnue esté en otro paquete
	protected int mi_var_1 = 5;
	int mi_var_2 = 7;

	String mi_metodo() {
		return "El valor de mi_var_2 es: " + mi_var_2;
	}
}
