package ingredientes;
public class EmbutidoPerro extends Embutido {
	@Override
	public String utilizar() {
		return "Hmm una deliciosa Salchicha "+this.categoria.mostrarEspecificacion();
	}
}
