package logica;

import java.util.ArrayList;

public class CareTaker {
	private ArrayList <Momento> estados = new ArrayList<Momento>(); //arreglo de momentos
	
	String consulta="";
	public void agregarMomento(Momento memento){ //agrega un momento
		estados.add(memento);
	}
	public Momento obtenerMomento(int posicion){ //obtiene un momento dada una posicion
		return estados.get(posicion);
	}

	public String mostrarMomento(int posicion){ //muestra un momento (String)
		return obtenerMomento(posicion).obtenerEstadoGuardado(); 
	}
	
	public ArrayList<Momento> obtenerMomentos(){ //arroja todo el array de mementos(Momento)
		return estados;
	}
	
	public String mostrarMomentos (){ //muestra todos los estados de los momentos
		for (int i=0; i<estados.size();i++){
			consulta += i+" "+ obtenerMomento(i).obtenerEstadoGuardado()
					+"\n";
		}
		return consulta;
	}
	
}
