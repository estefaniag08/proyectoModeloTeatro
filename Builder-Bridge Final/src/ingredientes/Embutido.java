package ingredientes;
import categorias.CategoriaEmbutido;
public abstract class Embutido{
	protected CategoriaEmbutido categoria;	
	public CategoriaEmbutido getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEmbutido categoria) {
		this.categoria = categoria;
	}
	public abstract String utilizar();
}
