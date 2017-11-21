package cocinas;
import comidas.Comida;
import comidas.Hamburguesa;
import ingredientes.Embutido;
import ingredientes.EmbutidoHamburguesa;
import ingredientes.Pan;
import ingredientes.PanHamburguesa;
import ingredientes.Queso;
import ingredientes.QuesoHamburguesa;
public class CocinaHamburguesa extends Cocina {
	@Override
	public Pan prepararPan() {	
		return new PanHamburguesa();
	}
	@Override
	public Embutido prepararEmbutido() {		
		return new EmbutidoHamburguesa();
	}
	@Override
	public Queso prepararQueso() {	
		return new QuesoHamburguesa();
	}
	@Override
	public Comida prepararBase() {
		return new Hamburguesa();
	}
}
