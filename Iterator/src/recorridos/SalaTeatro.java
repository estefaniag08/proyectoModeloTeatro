package recorridos;

public class SalaTeatro implements Sala {
	public int lista[] = new int[50];
	public void insertarValores(int valor, int posicion) {
		lista[posicion]=valor;
	}
	public Iterador ObtenerIterator() {
		return new IteradorTeatro(lista);
	}
}
