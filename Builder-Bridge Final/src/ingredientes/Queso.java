package ingredientes;

import categorias.CategoriaQueso;

public abstract class Queso{
	protected CategoriaQueso categoria;
	
	public CategoriaQueso getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaQueso categoria) {
		this.categoria = categoria;
	}

	public abstract String utilizar();

}
