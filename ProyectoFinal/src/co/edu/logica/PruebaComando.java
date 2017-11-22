package co.edu.logica;


import co.edu.logica.comandoComponentes.*;

public class PruebaComando {
	private Invocador invocarComp = new Invocador();	//Objeto tipo invocador
	private Comando comando=null;
	/**Ejecuta un componente a traves de un comando*/
	public void ejecucionComponentes(int opcionComp){
		int opcion=opcionComp;
		invocarComp.invocarComp(inicializarComandos(opcionComp));
		invocarComp.run();
	}
	/**Inicializa los comandos*/
	private Comando inicializarComandos(int opcion){
		switch(opcion){
			case 0:{
				comando = new ComandoInterpreter();
			} break;
			case 1:{
				comando = new ComandoVisitor();
			} break;
			case 2:{
				comando = new ComandoBuilderBridge();
			} break;
			case 3:{
				comando = new ComandoComposite();
			} break;
			case 4:{
				comando = new ComandoPlantilla();
			} break;
			case 5:{
				comando = new ComandoStrategy();
			} break;
			case 6:{
				comando = new ComandoFlyweightMetodoF();
			} break;
			case 7:{
				comando = new ComandoMemento();
			} break;
			case 8:{
				comando = new ComandoProxySingleton();	
			} break;
			case 9:{
				comando = new ComandoDecorador();
			} break;
			case 10:{
				comando = new ComandoIterator();
			} break;
			case 11:{
				comando = new ComandoEstado();
			} break;
			case 12:{
				comando = new ComandoCadena();
			} break;
			case 13:{
				comando = new ComandoAdapter();
			}
			default:
			break;
		}
		return comando;

	}
	
	
}
