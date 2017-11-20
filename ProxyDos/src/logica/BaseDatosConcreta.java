package logica;

public class BaseDatosConcreta extends BaseDatos{

	static BaseDatosConcreta baseDatos=null;
	private BaseDatosConcreta(){
	}
	
	// Singleton para evitar que se instancia varias veces en
	// la base concreta 
	
	public static BaseDatosConcreta getBaseDatosConcreta(){ 
		
		if (baseDatos==null){
			baseDatos= new BaseDatosConcreta();
		}
		return baseDatos;
	}
	//metodo para mostrar la informacion de una persona dado su nombre
	@Override
	public String mostrarInfo(String nombre) {
		for(int i=0;i<datos.size();i++){
			if(datos.get(i).getNombre().toLowerCase().equals(nombre.toLowerCase())){
				consulta= "Nombre: "+ datos.get(i).getNombre() + "\n"+
						"Apellido: "+datos.get(i).getApellido() + "\n"+
						"Edad:"+ datos.get(i).getEdad();
				i= datos.size();
			}
		}
		return consulta;
	}
	//metodo para agregrar una persona a la base de datos
	@Override
	public void agregarPersona(String nombre,String apellido, int edad) {
		
		persona= new Persona();
		persona.setApellido(apellido);
		persona.setNombre(nombre);
		persona.setEdad(edad);
		datos.add(persona);
	}
}
