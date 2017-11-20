package co.edu.logica.comandoComponentes;
import co.edu.logica.PruebaVisitor;

public class ComandoVisitor implements Comando {
	private PruebaVisitor visitor = new PruebaVisitor();
	
	public void ejecutar() {
		try{
			visitor.main(null);
			} catch (Exception e){
				visitor = new PruebaVisitor ();
			}

	}

}
