package co.edu.logica.comandoComponentes;

import logica.PruebaMemento;

public class ComandoMemento implements Comando{
	private PruebaMemento memento = new PruebaMemento();
	
	public void ejecutar() {
		try {
			memento.main(null);
		} catch (Exception e){
			memento = new PruebaMemento();
		}
		
	}

}
