package co.edu.logica;

import java.util.Scanner;
import gestorFlujoConsola.*;
public class PruebaInterpreter {
	public static void main (String args[]){
		
		Entrada entradaDatos = new Entrada();	//Objetos del componente
		Salida salidaDatos = new Salida();
		String codigo;							//Codigo que ingresa el empleado	
		double traduccionCodigo;				//Traduccion al codigo ingresado
		
		Diccionario dCodigos = new Diccionario();	//Diccionario de codigos
		Expresion interpretadorExpresiones;			//Expresiones expecificas
		
		salidaDatos.mostrar("Por favor escriba el c�digo del producto y el c�digo de la promoci�n seguido de un gui�n (XX-XX)");
		codigo=entradaDatos.leer();
		
		dCodigos.RecibirCodigo(codigo.toUpperCase());					//El diccionario recibe el codigo
		interpretadorExpresiones = new ExpresionFinalPromo();			//Interpreter
		traduccionCodigo=interpretadorExpresiones.interpret(dCodigos);	//Traduce el codigo, se inserta el contexto (diccionario)
		
		if(traduccionCodigo==0){
			salidaDatos.mostrar("El c�digo ingresado no es v�lido");
		} else {
			salidaDatos.mostrar("El precio total del producto es de:" +traduccionCodigo);
		}
		
		
	}
}
