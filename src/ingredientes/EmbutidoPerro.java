package ingredientes;

import categorias.CategoriaEmbutido;

public class EmbutidoPerro extends Embutido {

	@Override
	public String utilizar() {
		return "Hmm una deliciosa Salchicha "+this.categoria.mostrarEspecificacion();
	}

}
