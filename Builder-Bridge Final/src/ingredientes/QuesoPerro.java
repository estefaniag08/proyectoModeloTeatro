package ingredientes;
public class QuesoPerro extends Queso{
	@Override
	public String utilizar() {
		return "Un delicioso queso para perro "+ this.categoria.mostrarEspecificacion();
	}
}
