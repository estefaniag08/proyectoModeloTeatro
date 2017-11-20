package logica;

public class Momento {

	private String estado;//estado del momento
	
	public Momento(String estado){//crea un momento definiendole un estado por parametro
		this.estado = estado;
	}
	public String obtenerEstadoGuardado(){// regresa el estado del momento
		return estado;
	}
	
}
