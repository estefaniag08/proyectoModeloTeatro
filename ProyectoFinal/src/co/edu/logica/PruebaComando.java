package co.edu.logica;

import java.util.ArrayList;

import co.edu.logica.comandoComponentes.*;


public class PruebaComando {
	private Invocador invocarComp = new Invocador();	//Objeto tipo invocador
	private ArrayList<Comando> listaComando = new ArrayList<Comando>();		//Lista de comandos
	/**Ejecuta un componente a traves de un comando*/
	public void ejecucionComponentes(int opcionComp){
		int opcion=opcionComp;
		invocarComp.invocarComp(listaComando.get(opcion));
		invocarComp.run();
	}
	/**Inicializa los comandos*/
	public void inicializarComandos(){
		listaComando.add(new ComandoInterpreter());		//0
		listaComando.add(new ComandoVisitor());			//1
		listaComando.add(new ComandoBuilderBridge());	//2
		listaComando.add(new ComandoComposite());		//3
		listaComando.add(new ComandoPlantilla());		//4
		listaComando.add(new ComandoStrategy());		//5
	}
	
	
}
