package salas;

import gestorFlujoConsola.*;

public class ClienteDiscapacitado extends Cliente {
	public void pedirReserva() {
		Salida salida = new Salida();
		salida.mostrar("Se le redirigira al area para comprar sus boletas en un sitio adecuado para usted");
	}
}
