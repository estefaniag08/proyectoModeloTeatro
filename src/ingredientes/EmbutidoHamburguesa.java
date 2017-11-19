package ingredientes;

import categorias.CategoriaEmbutido;

public class EmbutidoHamburguesa extends Embutido {

	@Override
	public String utilizar() {
		return "Hmmm una deliciosa carne para hamburguesa "+this.categoria.mostrarEspecificacion();
	}
}
