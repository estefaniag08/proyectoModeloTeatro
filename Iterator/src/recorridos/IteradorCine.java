package recorridos;

public class IteradorCine implements Iterador {
	private int sillas[] = new int[50];

	private int posicionActual = 19;

	public IteradorCine (int listado[]) {
		System.arraycopy(listado, 0, this.sillas, 0, 50);
	}

	public void Primero() {
		this.posicionActual = 19;
	}

	public int Actual() {
		if ((this.sillas == null) || (posicionActual > 30 - 1) || (this.posicionActual < 20))
			return 0;

		else
			return this.sillas[posicionActual];
	}

	public int Siguiente() {

		if ((this.sillas == null) || (posicionActual + 1 > 30 - 1))
			return 0;

		else
			return this.sillas[posicionActual+=5];
	}

	public boolean QuedanElementos() {

		return (posicionActual + 1 <= 30 - 1);
	}
}
