package plantilla;

import combos.*;
import gestorFlujoConsola.*;

public class PruebaPlantilla {

	public static void main(String[] args) {
		Combo combo = null;
		Salida salida = new Salida();
		Entrada entrada = new Entrada();
		int eleccion;
		salida.mostrar("bienvenido a la seccion de comidas del cine, seleccione el combo que desee ver");
		salida.mostrar("1.Combo Deluxe");
		salida.mostrar("2.Combo Pareja");
		salida.mostrar("3.Combo de Temporada");
		eleccion = entrada.leerEntero();
		switch (eleccion) {
		case 1:
			combo = new ComboDeluxe();
			break;
		case 2:
			combo = new ComboPareja();
			break;
		case 3:
			combo = new ComboTemporada();
			break;
		}
		salida.mostrar(combo.obtenerInfo());
	}

}
