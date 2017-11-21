package recorridos;

public class IteradorBase implements Iterador{
	private int sillas[] = new int[50];

	private int posicionActual = -1;

	public IteradorBase(int listado[]) {
		System.arraycopy(listado, 0, this.sillas, 0, 50);
	}

	public void Primero() {
		this.posicionActual = -1;
	}

	public int Actual() {
		if ((this.sillas == null) ||(posicionActual > 50 - 1)|| (this.posicionActual < 0))
			return 0;

		else
			return this.sillas[posicionActual];
	}

	public int Siguiente() {

		if ((this.sillas == null)|| (posicionActual + 1 > 50 - 1))
			return 0;

		else
			return this.sillas[++posicionActual];
	}

	public boolean QuedanElementos() {

		return (posicionActual + 1 <= 50 - 1);
	}
}
