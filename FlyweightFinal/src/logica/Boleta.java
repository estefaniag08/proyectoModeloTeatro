package logica;

public abstract class Boleta {
	
	//elemento intrinseco
	protected String separador= "==================================================";
	//elementos extrinsecos
	protected String nombreAfiliado;
	protected String evento;
	
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
	public Boleta(String nombre, String evento){
		this.nombreAfiliado= nombre;
		this.evento= evento;
		
	}
	//metodo abstracto imprimir 
	public abstract String imprimir();
}
