package ingredientes;
public class QuesoHamburguesa extends Queso{
	@Override
	public String utilizar() {
		return "Un delicioso queso para hamburguesa "+ this.categoria.mostrarEspecificacion();
	}
}
