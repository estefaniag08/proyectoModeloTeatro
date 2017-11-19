package ingredientes;
import categorias.CategoriaPan;

public abstract class Pan {
	protected CategoriaPan categoria;
	
	
	public CategoriaPan getCategoria() {
		return categoria;
	}


	public void setCategoria(CategoriaPan categoria) {
		this.categoria = categoria;
	}


	public abstract String utilizar();
}
