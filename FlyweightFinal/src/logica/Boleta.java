package logica;

public abstract class Boleta {
	
	
	//elementos intrinsecos
	protected String separador= "==================================================";
	protected String evento;
	
	//elementos extrinsecos
	protected String nombreAfiliado;
	
	
	//getters y setters
	public String getNombreAfiliado() {
		return nombreAfiliado;
	}
	public void setNombreAfiliado(String nombreAfiliado) {
		this.nombreAfiliado = nombreAfiliado;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public Boleta(String evento){
		this.evento= evento;
		
	}
	//metodo abstracto imprimir 
	public abstract String imprimir();
	
}
