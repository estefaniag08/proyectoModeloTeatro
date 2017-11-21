package co.edu.logica.comandoComponentes;

import plantilla.PruebaPlantilla;

public class ComandoPlantilla implements Comando {
	private PruebaPlantilla plantilla = new PruebaPlantilla(); 
	
	public void ejecutar() {
		try {
			plantilla.main(null);
		} catch(Exception e){
			plantilla = new PruebaPlantilla();
		}

	}

}
