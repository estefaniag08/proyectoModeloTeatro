package banco;

import gestorFlujoConsola.Salida;

public class JefeCine implements EmpleadoCine {
	public EmpleadoCine next;

	public void queja(String reclamo) {
		Salida salida = new Salida();
		salida.mostrar("Yo, el Jefe del cine, me encargo de todo");

	}

	public void setNext(EmpleadoCine nivel) {
		next = nivel;
	}
}
