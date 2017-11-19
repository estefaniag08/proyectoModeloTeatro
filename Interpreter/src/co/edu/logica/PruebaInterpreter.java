package co.edu.logica;

import java.util.Scanner;

public class PruebaInterpreter {
	public static void main (String args[]){
		Scanner lectura = new Scanner (System.in);
		
		String codigo;
		double traduccionCodigo;
		
		Diccionario dCodigos = new Diccionario();
		Expresion interpretadorExpresiones;
		
		System.out.println("Por favor escriba el c�digo del producto y el c�digo de la promoci�n seguido de un gui�n (XX-XX)");
		codigo=lectura.nextLine(); 
		
		dCodigos.RecibirCodigo(codigo.toUpperCase());
		interpretadorExpresiones = new ExpresionFinalPromo();
		traduccionCodigo=interpretadorExpresiones.interpret(dCodigos);
		
		if(traduccionCodigo==0){
			System.out.println("El c�digo ingresado no es v�lido");
		} else {
			System.out.println("El precio total del producto ingresado es de:" +traduccionCodigo);
		}
		
		
	}
}
