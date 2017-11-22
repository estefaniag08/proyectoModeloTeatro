package salas;

import gestorFlujoConsola.*;

public class ClienteVip extends Cliente {

	public void pedirReserva() {
		Salida salida = new Salida();
		salida.mostrar("Se le redirigira al area para comprar sus boletas en el mejor sitio del cine");
	}
}
