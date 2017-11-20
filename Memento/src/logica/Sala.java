package logica;


public class Sala {
	
	private String estado;
	public Momento enviarAMomento(){ //se envia el estado al momento
	return new Momento(estado);
	}
	public Sala (){// inicia la sala disponible por defecto
		estado= "Disponible";
		
	}	
	public void asignarEstadoPasado(Momento memento){// asigna un estado a la sala segun un momento pasado
		estado= memento.obtenerEstadoGuardado();
	}	
	public String getEstado(){
		return estado;
	}
	
	public void setEstado(String estado){
		this.estado= estado;
		
	}	
}
