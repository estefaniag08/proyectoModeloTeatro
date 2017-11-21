package iterador;

import gestorFlujoConsola.*;
import recorridos.*;

public class PruebaIterador {

	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		int opcion;
		Sala sala;
		Iterador iterador;
		salida.mostrar("Que desea saber?");
		salida.mostrar("1. las mejores sillas en el teatro");
		salida.mostrar("2. las mejores sillas en el cine");
		salida.mostrar("3. las mejores sillas para el concierto");
		opcion = entrada.leerEntero();
		switch (opcion) {
		case 1:
			sala = new SalaTeatro();
			break;
		case 2:
			sala = new SalaCine();
			
			break;
		case 3:
			sala = new SalaConcierto();
			
			break;
		default:
			sala = new SalaBase();
		}
		for (int contador = 0; contador < 50; contador++) {
			sala.insertarValores(contador + 1, contador);
		}
		
		iterador =  sala.ObtenerIterator();
		salida.mostrar("Los mejores asientos para esa funcion son:");
		while (iterador.QuedanElementos()) {
			salida.mostrar(iterador.Siguiente());
		}
	}

}
