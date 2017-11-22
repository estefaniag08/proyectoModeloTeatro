package co.edu.logica.comandoComponentes;

import iterador.PruebaIterador;

public class ComandoIterator implements Comando {
	private PruebaIterador iterator = new PruebaIterador();
	
	public void ejecutar() {
		try{
			iterator.main(null);
		} catch (Exception e){
			iterator = new PruebaIterador(); 
		}
		
	}

}
