package salas;

import gestorFlujoConsola.*;

public class ClienteNormal extends Cliente {

	public void pedirReserva() {
		Salida salida = new Salida();
		salida.mostrar("Se le redirigira al area para comprar sus boletas para el cine");
	}
}
