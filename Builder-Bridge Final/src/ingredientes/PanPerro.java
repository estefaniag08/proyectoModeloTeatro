package ingredientes;



public class PanPerro extends Pan{

	@Override
	public String utilizar() {
		return "Un delicioso pan para hamburguesa "+ this.categoria.mostrarEspecificacion();
	}

}
