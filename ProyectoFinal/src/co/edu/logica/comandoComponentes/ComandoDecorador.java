package co.edu.logica.comandoComponentes;

import decorador.PruebaDeco;

public class ComandoDecorador implements Comando {
	private PruebaDeco decorador = new PruebaDeco();
	
	public void ejecutar() {
		try{
			decorador.main(null);
		} catch(Exception e){
			decorador = new PruebaDeco();
		}
	}
}
