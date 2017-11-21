package ingredientes;
public class PanSandwich extends Pan{
	@Override
	public String utilizar() {	
		return "Un delicioso pan para sandwich "+ this.categoria.mostrarEspecificacion();
	}
}
