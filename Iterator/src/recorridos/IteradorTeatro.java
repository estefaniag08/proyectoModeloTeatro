package recorridos;

public class IteradorTeatro implements Iterador{
	private int sillas[] = new int[50];

	private int posicionActual = 3;

	public IteradorTeatro(int listado[]) {
		System.arraycopy(listado, 0, this.sillas, 0, 50);
	}

	public void Primero() {
		this.posicionActual = 3;
	}

	public int Actual() {
		if ((this.sillas == null) ||(posicionActual > 15 - 1)|| (this.posicionActual < 4))
			return 0;

		else
			return this.sillas[posicionActual];
	}

	public int Siguiente() {

		if ((this.sillas == null)|| (posicionActual + 1 > 15 - 1))
			return 0;

		else
			return this.sillas[++posicionActual];
	}

	public boolean QuedanElementos() {

		return (posicionActual + 1 <= 15 - 1);
	}
}
