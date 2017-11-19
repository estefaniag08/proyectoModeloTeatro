package cocinas;

import categorias.*;
import ingredientes.*;
import comidas.Comida;

public class Director {
	//declarando atributos
	private Comida comida;
	private Pan pan;
	private Embutido embutido;
	private Queso queso;
	private Cocina cocina;
	
/**
 * metodo para preparar la comida 
 * @param opcion
 * @param catP
 * @param catQ
 * @param catE
 * @return
 */
	
	public Comida preparar(int opcion,CategoriaPan catP, CategoriaQueso catQ, CategoriaEmbutido catE) {

		switch (opcion) { // llama a la cocina correspondiente segun la eleccion del cliente
		case 1:
			cocina = new CocinaPerroCaliente();
			break;
		case 2:
			cocina = new CocinaHamburguesa();
			break;
		case 3:
			cocina = new CocinaSandwich();
			break;
		}
		//prepara los ingredientes
		comida = cocina.prepararBase();
		pan = cocina.prepararPan();
		embutido = cocina.prepararEmbutido();
		queso = cocina.prepararQueso();
		
		//le asigna una categoria a los ingredientes
		pan.setCategoria(catP);
		embutido.setCategoria(catE);
		queso.setCategoria(catQ);
		//le asigna a la comida los ingredientes preparados, en orden
		comida.setPan(pan);
		comida.setEmbutido(embutido);
		comida.setQueso(queso);	
		return comida;
	}
	/**
	 * muestra las especificaciones de los ingredientes, teniendo en cuenta su categoria
	 * @return
	 */
	public String especificarComida (){
		return 
				pan.utilizar()+ "\n"+
				embutido.utilizar()+ "\n"+
				queso.utilizar();
		
	}
}
