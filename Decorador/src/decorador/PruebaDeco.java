package decorador;

import teatro.*;
import gestorFlujoConsola.*;

public class PruebaDeco {

	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		Sala sala = new Cine();
		CineDecorado dec = null;
		int opcion;
		salida.mostrar("digite el numero correspondiente a como desea organizar la sala de cine");
		salida.mostrar("0.Terminar de organizar el cine");
		salida.mostrar("1.preparar para cine 2d");
		salida.mostrar("2.preparar para cine 3d");
		salida.mostrar("3.preparar para cine 4d");
		salida.mostrar("4.preparar para cine 6d");
		while (true) {
			opcion = entrada.leerEntero();
			switch (opcion) {
			case 1:
				salida.mostrar(sala.prepararFuncion());
				break;
			case 2:
				dec = new Cine3d((Cine) sala);
				salida.mostrar(dec.prepararFuncion());
				break;
			case 3:
				dec = new Cine4d((Cine) sala);
				salida.mostrar(dec.prepararFuncion());
				break;
			case 4:
				dec = new Cine6d((Cine) sala);
				salida.mostrar(dec.prepararFuncion());
				break;
			}

			if (opcion == 0) {
				break;
			}
		}
	}
}
