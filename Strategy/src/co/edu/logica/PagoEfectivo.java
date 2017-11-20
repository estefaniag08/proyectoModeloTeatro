package co.edu.logica;
import gestorFlujoConsola.*;

public class PagoEfectivo implements Estrategia {
	private int dineroCambio;
	private int dineroRecibido;
	
	public void pagar(int valor) {
		salidaDatos.mostrar("Ingrese el dinero en efectivo recibido");
		dineroRecibido=entradaDatos.leerEntero();
		if(dineroRecibido<valor){
			salidaDatos.mostrar("No se pudo realizar la transacción, no hay ingresó suficiente dinero");
		} else {
			salidaDatos.mostrar("Caja abierta para depositar dinero y dar cambio");
			dineroCambio= dineroRecibido-valor;
			salidaDatos.mostrar("El cambio es de:" + dineroCambio);
			salidaDatos.mostrar("Transacción Finalizada");
		}
	}

}
