package cocinas;

import comidas.Comida;
import comidas.Sandwich;
import ingredientes.Embutido;
import ingredientes.EmbutidoSandwich;
import ingredientes.Pan;
import ingredientes.PanSandwich;
import ingredientes.Queso;
import ingredientes.QuesoSandwich;


public class CocinaSandwich  extends Cocina{
	@Override
	public Pan prepararPan() {	
		return new PanSandwich();
	}	
	@Override
	public Embutido prepararEmbutido() {	
		return new EmbutidoSandwich();
	}

	@Override
	public Queso prepararQueso() {	
		return new QuesoSandwich();
	}
	@Override
	public Comida prepararBase() {
		// TODO Auto-generated method stub
		return new Sandwich();
	}
}
