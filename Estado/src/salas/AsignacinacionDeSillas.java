package salas;

import gestorFlujoConsola.*;

public class AsignacinacionDeSillas {
	public Cliente cliente;

	public void reservarSilla(int tipo) {
		switch (tipo) {
		case 1:
			cliente = new ClienteNormal();
			break;
		case 2:
			cliente = new ClienteVip();
			break;
		case 3:
			cliente = new ClienteDiscapacitado();
			break;
		default:
			Salida salida = new Salida();
			salida.mostrar("Ese tipo de cliente no existe");

		}
	}

	public void pedirReserva() {
		cliente.pedirReserva();
	}

}
