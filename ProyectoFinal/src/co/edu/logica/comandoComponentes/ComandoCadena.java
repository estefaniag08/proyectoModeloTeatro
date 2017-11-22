package co.edu.logica.comandoComponentes;

import cadena.Cadena;

public class ComandoCadena implements Comando {
	private Cadena cadena = new Cadena();
	
	public void ejecutar() {
		try {
			cadena.main(null);
		} catch(Exception e){
			cadena = new Cadena();
		}

	}

}
