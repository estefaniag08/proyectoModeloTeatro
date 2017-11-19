package cocinas;

import comidas.Comida;

import ingredientes.Embutido;
import ingredientes.Pan;
import ingredientes.Queso;

public abstract class Cocina {
	public abstract Pan prepararPan ();
	public abstract Embutido prepararEmbutido();
	public abstract Queso prepararQueso();
	public abstract Comida prepararBase();

}
