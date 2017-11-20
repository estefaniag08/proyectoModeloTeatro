package co.edu.logica.comandoComponentes;

public class Invocador {
	private Comando comando;
	/**Invoca al comando que ejecuta el componente*/
	public void invocarComp(Comando comandoComp){
		comando=comandoComp;
	}
	/**Ejecuta el comando*/
	public void run(){
		comando.ejecutar();
	}
}
