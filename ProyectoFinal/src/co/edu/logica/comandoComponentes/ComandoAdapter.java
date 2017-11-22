package co.edu.logica.comandoComponentes;

import co.edu.logica.PruebaAdapter;

public class ComandoAdapter implements Comando {
	private PruebaAdapter adapter = new PruebaAdapter();
	
	public void ejecutar() {
		try{
			adapter.main(null);
		} catch(Exception e){
			adapter = new PruebaAdapter();
		}

	}

}
