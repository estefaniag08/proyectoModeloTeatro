package co.edu.logica;

import co.edu.logica.boleta.*;
import co.edu.logica.visitor.*;
import gestorFlujoConsola.*;

public class PruebaVisitor {
	public static void main(String args []){
	
		Entrada entradaDatos = new Entrada();	//Objetos del componente
		Salida salidaDatos = new Salida();
		
		Visitor visitante = null;		//Referencia a un objeto visitante
		Boleta boleta = null;			//Referencia a un objeto boleta
		int opcionBoleta, opcionPromo;
		
		salidaDatos.mostrar("Por favor seleccione el tipo de boleta");	//Muestra todas las opciones de boletas y promociones
		salidaDatos.mostrar("1. Cine");
		salidaDatos.mostrar("2. Teatro");
		salidaDatos.mostrar("3. Evento de música");
		opcionBoleta=entradaDatos.leerEntero();
		
		salidaDatos.mostrar("Por favor seleccione la promoción");
		salidaDatos.mostrar("1. Descuento por edad");
		salidaDatos.mostrar("2. Descuento de temporada");
		salidaDatos.mostrar("3. Descuento por ser cliente frecuente");
		opcionPromo=entradaDatos.leerEntero();
		
		switch(opcionBoleta){			//Crea el objeto dependiendo las opciones
			case 1:{
				boleta = new BoletaCine();
			}break;
			case 2:{
				boleta = new BoletaTeatro();
			}break;
			case 3:{
				boleta = new BoletaMusica();
			}break;
			default: break;	
		}
		
		switch (opcionPromo){
		case 1:{
			visitante = new VisitorEdad();
		}break;
		case 2:{
			visitante = new VisitorTemporadaEsp();
		}break;
		case 3:{
			visitante = new VisitorClientesFrec();
		}break;
		default: break;	
		}
		
		try {
			boleta.aceptarVisitor(visitante);		//La boleta acepta al tipo de visitante que hace la promocion
			salidaDatos.mostrar("El precio total de la boleta es de:" + boleta.getPrecioBoleta());	
		} catch(Exception e){
			salidaDatos.mostrar("Error al ingresar las opciones");
		}
		
	}
}
