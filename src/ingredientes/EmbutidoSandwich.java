package ingredientes;

import categorias.CategoriaEmbutido;

public class EmbutidoSandwich extends Embutido {

	@Override
	public String utilizar() {
		
		return "Hmmm un delicioso jam�n "+this.categoria.mostrarEspecificacion();
	}
	

}
