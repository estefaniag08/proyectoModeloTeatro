package co.edu.logica;
import gestorFlujoConsola.*;

public interface Estrategia {
	Entrada entradaDatos = new Entrada();
	Salida salidaDatos = new Salida();
	/**Método que implementa un algoritmo unico para realizar un pago*/
	public void pagar(int valor);
}
