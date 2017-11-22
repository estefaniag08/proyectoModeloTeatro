package recorridos;

public class SalaConcierto implements Sala{
	public int lista[] = new int[50];
	public void insertarValores(int valor, int posicion) {
		lista[posicion]=valor;
	}
	public Iterador ObtenerIterator() {
		return new IteradorConcierto(lista);
	}
}
