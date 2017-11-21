package cocinas;
import comidas.Comida;
import comidas.PerroCaliente;
import ingredientes.Embutido;
import ingredientes.EmbutidoPerro;
import ingredientes.Pan;
import ingredientes.PanPerro;
import ingredientes.Queso;
import ingredientes.QuesoPerro;

public class CocinaPerroCaliente extends Cocina {
	@Override
	public Pan prepararPan() {	
		return new PanPerro();
	}
	@Override
	public Embutido prepararEmbutido() {
		
		return new EmbutidoPerro();
	}
	@Override
	public Queso prepararQueso() {
		
		return new QuesoPerro();
	}
	@Override
	public Comida prepararBase() {
		// TODO Auto-generated method stub
		return new PerroCaliente();
	}
}
