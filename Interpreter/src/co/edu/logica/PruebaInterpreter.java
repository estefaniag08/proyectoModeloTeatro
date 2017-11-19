package co.edu.logica;

import java.util.Scanner;

public class PruebaInterpreter {
	public static void main (String args[]){
		Scanner lectura = new Scanner (System.in);
		
		String codigo;
		double traduccionCodigo;
		
		Diccionario dCodigos = new Diccionario();
		Expresion interpretadorExpresiones;
		
		System.out.println("Por favor escriba el código del producto y el código de la promoción seguido de un guión (XX-XX)");
		codigo=lectura.nextLine(); 
		
		dCodigos.RecibirCodigo(codigo.toUpperCase());
		interpretadorExpresiones = new ExpresionFinalPromo();
		traduccionCodigo=interpretadorExpresiones.interpret(dCodigos);
		
		if(traduccionCodigo==0){
			System.out.println("El código ingresado no es válido");
		} else {
			System.out.println("El precio total del producto ingresado es de:" +traduccionCodigo);
		}
		
		
	}
}
