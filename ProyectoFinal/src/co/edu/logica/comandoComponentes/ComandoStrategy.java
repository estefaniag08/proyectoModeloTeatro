package co.edu.logica.comandoComponentes;

import co.edu.logica.PruebaEstrategia;

public class ComandoStrategy implements Comando {
	private PruebaEstrategia strategy = new PruebaEstrategia();
	
	public void ejecutar() {
		try {
			strategy.main(null);
		} catch(Exception e){
			strategy = new PruebaEstrategia();
		}

	}

}
