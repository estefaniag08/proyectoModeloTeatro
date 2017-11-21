/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoteatro;

import salas.*;
import gestorFlujoConsola.*;

/**
 *
 * @author zachl
 */
public class PruebaEstado {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		AsignacinacionDeSillas silla = new AsignacinacionDeSillas();
		int opcion;
		salida.mostrar("Seleccione el tipo de asiento que se adecue a sus necesidades");
		salida.mostrar("1. Normal");
		salida.mostrar("2. Para discapacitados");
		salida.mostrar("3. En el mejor sitio");
		opcion = entrada.leerEntero();
		silla.reservarSilla(opcion);
		silla.pedirReserva();
	}

}
