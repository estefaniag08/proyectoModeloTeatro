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
			salida.mostrar("evento y nombre, separados por enter");

			Boleta boleta= fabrica.getBoleta(entrada.leer());
			boleta.setNombreAfiliado(entrada.leer());
			salida.mostrar(boleta.imprimir());
			salida.mostrar("1.Seguir");
			salida.mostrar("0.Parar");
			eleccion= entrada.leerEntero();
		} while(eleccion==1);
			
		
		
	}
}
