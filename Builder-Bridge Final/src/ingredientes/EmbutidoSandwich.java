package ingredientes;



public class EmbutidoSandwich extends Embutido {

	@Override
	public String utilizar() {
		
		return "Hmmm un delicioso jam�n "+this.categoria.mostrarEspecificacion();
	}
	

}
