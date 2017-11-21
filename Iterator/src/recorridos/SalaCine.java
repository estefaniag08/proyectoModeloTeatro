package recorridos;

public class SalaCine implements Sala {
	public int lista[] = new int[50];
	public void insertarValores(int valor, int posicion) {
		lista[posicion]=valor;
	}
	public Iterador ObtenerIterator() {
		return new IteradorCine(lista);
	}
}
