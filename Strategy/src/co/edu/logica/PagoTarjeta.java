package co.edu.logica;

public class PagoTarjeta implements Estrategia{
	private int numeroTarjeta;
	private int numeroCuotas;
	public void pagar(int valor) {
		salidaDatos.mostrar("Por favor ingrese el n�mero de la tarjeta");
		numeroTarjeta=entradaDatos.leerEntero();
		salidaDatos.mostrar("Escriba el n�mero de cuotas con el que desea diferir el pago");
		numeroCuotas=entradaDatos.leerEntero();
		salidaDatos.mostrar("Cada cuota ser� de: " + (valor/numeroCuotas) + " pesos.");
		salidaDatos.mostrar("Transacci�n realizada con �xito");
	}

}
