package co.edu.logica.comandoComponentes;

import compositeteatro.PruebaCompo;


public class ComandoComposite implements Comando{
	private PruebaCompo composite = new PruebaCompo();
	
	public void ejecutar() {
		try{
			composite.main(null);
			} catch (Exception e){
				composite = new PruebaCompo();
			}
		
	}

}
