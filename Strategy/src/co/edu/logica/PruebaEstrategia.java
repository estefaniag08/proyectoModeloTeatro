package co.edu.logica;

import gestorFlujoConsola.*;

public class PruebaEstrategia {
	public static void main (String args[]){
		Entrada entradaDatos = new Entrada();	//Objetos del componente
		Salida salidaDatos = new Salida();
		
		int valorBoleta;						//El precio a pagar del cliente
		int opcionMedioPago;					
		Estrategia estrategia = null;			//El tipo de estrategia que se aplicara para pagar
		Contexto pagoBoleta = new Contexto();	//El contexto donde se aplica el pago
		
		salidaDatos.mostrar("Ingrese el valor a pagar");	//Se ingresan los datos necesarios
		valorBoleta=entradaDatos.leerEntero();
		salidaDatos.mostrar("Ingrese el método de pago");
		salidaDatos.mostrar("1. Efectivo");
		salidaDatos.mostrar("2. Tarjeta de crédito");
		opcionMedioPago=entradaDatos.leerEntero();
		
		while (estrategia==null){
			switch(opcionMedioPago){
				case 1:{
					estrategia = new PagoEfectivo();
				}break;
				case 2:{
					estrategia = new PagoTarjeta();
				}break;
				default:{
					salidaDatos.mostrar("Medio de pago no válido, ingrese un número válido");
				}
			}
		}
		
		pagoBoleta.setEstrategia(estrategia);		//Se le añade una estrategia al pago de las boletas
		pagoBoleta.setValorBoletas(valorBoleta);	//El valor que se deberá pagar
		pagoBoleta.realizarPago();					//Se ejecuta la estrategia de pago
	}
}
