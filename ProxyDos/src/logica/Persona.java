package logica;

/**
 * Esta clase tiene los atributos de una persona que se agregará a 
 * la base de datos
 * @author Victoria
 *
 */

public class Persona {
	private String nombre;
	private int edad;
	private String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
}
