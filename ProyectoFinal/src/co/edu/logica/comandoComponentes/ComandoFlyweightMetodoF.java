package co.edu.logica.comandoComponentes;

import logica.PruebaFlyweight;

public class ComandoFlyweightMetodoF implements Comando {
	private PruebaFlyweight flyweight = new PruebaFlyweight();
	
	public void ejecutar() {
		try {
			flyweight.main(null);
		} catch (Exception e) {
			flyweight = new PruebaFlyweight();
		}
	}

}
