package logica;

import gestorFlujoConsola.Entrada;
import gestorFlujoConsola.Salida;

public class Prueba {
	public static void main (String arg []){
		//declaracion atributos
		BaseDatos base= new Proxy();
		Salida salida = new Salida ();
		Entrada entrada = new Entrada();
		
		salida.mostrar("¿Desea agregar una persona?");
		salida.mostrar("1. Si");
		salida.mostrar("0. No");
		
		
		int seguir = entrada.leerEntero();
		//permite agregar varias personas a la base de datos mediante el proxy
		while(seguir==1){ 
			base.agregarPersona(entrada.leer(), entrada.leer(), entrada.leerEntero());
			salida.mostrar("1. Seguir");
			salida.mostrar("0. Parar");
			seguir= entrada.leerEntero();	
		}
		salida.mostrar("¿Desea mostrar la información una persona?");
		salida.mostrar("1. Si");
		salida.mostrar("0. No");
		int buscar= entrada.leerEntero();
		
		//permite buscar varias personas a la base de datos mediante el proxy
		while(buscar==1){
			salida.mostrar(base.mostrarInfo(entrada.leer()));
			salida.mostrar("1. Seguir");
			salida.mostrar("0. Parar");
			buscar= entrada.leerEntero();	
		}
	}
	
	
}
