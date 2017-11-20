package logica;

public class Proxy extends BaseDatos{

	@Override
	public String mostrarInfo(String nombre) {
		
		BaseDatosConcreta concreta = BaseDatosConcreta.getBaseDatosConcreta(); //llama a la base concreta
		concreta.datos= this.datos; //iguala datos 
		return concreta.mostrarInfo(nombre); //busca en la base concreta y manda los datos
	}

	@Override
	public void agregarPersona(String nombre, String apellido,int edad) {
		BaseDatosConcreta concreta = BaseDatosConcreta.getBaseDatosConcreta();// llama a la base concreta
		concreta.datos= this.datos; //iguala datos
		concreta.agregarPersona(nombre,apellido,edad); // agrega los datos a la base concreta
	}
}
