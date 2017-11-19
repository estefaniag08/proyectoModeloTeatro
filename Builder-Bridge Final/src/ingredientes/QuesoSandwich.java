package ingredientes;



public class QuesoSandwich extends Queso{

	@Override
	public String utilizar() {
		
		return "Un delicioso queso para sandwich"+ this.categoria.mostrarEspecificacion();
	}

}
