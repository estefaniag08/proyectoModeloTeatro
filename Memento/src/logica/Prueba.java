package logica;

import gestorFlujoConsola.*;
public class Prueba {
	public static void main (String arg []){
		
	CareTaker caretaker = new CareTaker();
	Salida salida = new Salida();
	Entrada entrada = new Entrada();
	Sala sala = new Sala ();
	
	//agrega estado que la sala tiene por defecto
	caretaker.agregarMomento(sala.enviarAMomento());
	salida.mostrar("¿Desea agregar un nuevo estado a la sala?");
	salida.mostrar("1. Si");
	salida.mostrar("0. No");
	int decision = entrada.leerEntero();
	while(decision ==1){//agrega distintos estados de la sala 
		salida.mostrar("Ingrese estado");
		sala.setEstado(entrada.leer());
		caretaker.agregarMomento(sala.enviarAMomento());
		salida.mostrar("1. Seguir");
		salida.mostrar("0. Parar");
		decision= entrada.leerEntero();
	}
	
	salida.mostrar("Asi quedaron los estados de la sala");
	salida.mostrar(caretaker.mostrarMomentos());
	
	salida.mostrar("devolverse a un estado anterior, ingrese el numero de estado");
	//se devuelve a un estado anterior
	sala.asignarEstadoPasado(caretaker.obtenerMomento(entrada.leerEntero()));
	salida.mostrar("Estado actual: ");
	salida.mostrar(sala.getEstado());//muestra estado actual
	
	}
}
