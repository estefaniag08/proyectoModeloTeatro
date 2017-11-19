package comidas;

import ingredientes.Embutido;
import ingredientes.Pan;
import ingredientes.Queso;

public class Comida {
	
	protected Pan pan;
	protected Embutido embutido;
	protected Queso queso;
	
	public Pan getPan() {
		return pan;
	}
	public void setPan(Pan pan) {
		this.pan = pan;
	}
	public Embutido getEmbutido() {
		return embutido;
	}
	public void setEmbutido(Embutido embutido) {
		this.embutido = embutido;
	}
	public Queso getQueso() {
		return queso;
	}
	public void setQueso(Queso queso) {
		this.queso = queso;
	}
	
	
}
