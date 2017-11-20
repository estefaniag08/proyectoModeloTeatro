package co.edu.logica.comandoComponentes;
import co.edu.logica.PruebaInterpreter;

public class ComandoInterpreter implements Comando {
	private PruebaInterpreter interpreter = new PruebaInterpreter();
	
	public void ejecutar() {
		try{
			interpreter.main(null);
			} catch (Exception e){
				interpreter = new PruebaInterpreter ();
			}
	}

}
