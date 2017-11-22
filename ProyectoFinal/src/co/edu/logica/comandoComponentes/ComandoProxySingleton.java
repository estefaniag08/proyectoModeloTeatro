package co.edu.logica.comandoComponentes;

import logica.PruebaProxy;

public class ComandoProxySingleton implements Comando{
	private PruebaProxy proxySingleton = new PruebaProxy();
	
	public void ejecutar() {
		try {
			proxySingleton.main(null);
		} catch(Exception e){
			proxySingleton = new PruebaProxy();
		}
		
	}

}
