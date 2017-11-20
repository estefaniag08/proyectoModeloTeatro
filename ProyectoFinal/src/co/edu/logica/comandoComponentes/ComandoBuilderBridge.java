package co.edu.logica.comandoComponentes;
import gestionPrueba.Prueba;

public class ComandoBuilderBridge implements Comando{
	private Prueba builderBridge = new Prueba();

	public void ejecutar() {
		try{
			builderBridge.main(null);
			} catch (Exception e){
				builderBridge = new Prueba ();
			}
		
	}
}
