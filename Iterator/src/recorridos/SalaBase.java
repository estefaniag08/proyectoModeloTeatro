package recorridos;

public class SalaBase implements Sala{
	public int lista[] = new int[50];
	public void insertarValores(int valor, int posicion) {
		lista[posicion]=valor;
	}
	public Iterador ObtenerIterator() {
		return (new IteradorBase(lista));
	}
}
