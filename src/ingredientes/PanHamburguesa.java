package ingredientes;

import categorias.CategoriaPan;

public class PanHamburguesa extends Pan{

	@Override
	public String utilizar() {
		return "Un delicioso pan para perro "+ this.categoria.mostrarEspecificacion();
	}

}
