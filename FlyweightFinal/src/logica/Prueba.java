package logica;

import gestorFlujoConsola.*;

public class Prueba {
	public static void main(String arg[]) {
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		FabricaPesoLigero fabrica = new FabricaPesoLigero();
		int eleccion;
		//mostrando varias boletas usando la fabrica
		do{
			salida.mostrar("Ingrese nombre del Afiliado y nombre de evento separado por enter");
			salida.mostrar(fabrica.getBoleta(entrada.leer(), entrada.leer()).imprimir());
			salida.mostrar("1. Seguir");
			salida.mostrar("0. parar");
			eleccion= entrada.leerEntero();
		}
		while (eleccion==1);
	}
}
