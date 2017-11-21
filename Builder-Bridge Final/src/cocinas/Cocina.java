package cocinas;

import comidas.Comida;

import ingredientes.*;

public abstract class Cocina {
	public abstract Pan prepararPan ();
	public abstract Embutido prepararEmbutido();
	public abstract Queso prepararQueso();
	public abstract Comida prepararBase();

}
