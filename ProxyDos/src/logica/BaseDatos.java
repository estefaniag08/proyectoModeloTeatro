package logica;

import java.util.ArrayList;

public abstract class BaseDatos {
	
	protected Persona persona;
	protected ArrayList <Persona> datos = new ArrayList <Persona>();
	protected String consulta;
	public abstract String mostrarInfo(String nombre);
	public abstract void agregarPersona(String nombre,String apellido, int edad);
}
