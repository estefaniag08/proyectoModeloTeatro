package co.edu.logica.comandoComponentes;

import estadoteatro.PruebaEstado;

public class ComandoEstado implements Comando{
	private PruebaEstado estado = new PruebaEstado(); 
	
	public void ejecutar() {
		try{
			estado.main(null);
		} catch(Exception e){
			estado = new PruebaEstado();
		}
	}

}
