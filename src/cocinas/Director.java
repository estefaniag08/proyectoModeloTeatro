package cocinas;


import categorias.CategoriaEmbutido;
import categorias.CategoriaPan;
import categorias.CategoriaQueso;
import ingredientes.Embutido;
import ingredientes.Pan;
import ingredientes.Queso;
import comidas.Comida;

public class Director {
	private Comida comida;
	Pan pan;
	Embutido embutido;
	Queso queso;
	Cocina cocina;
	

	public Comida preparar(int opcion,CategoriaPan catP, CategoriaQueso catQ, CategoriaEmbutido catE) {

		switch (opcion) {
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
		comida = cocina.prepararBase();
		pan = cocina.prepararPan();
		embutido = cocina.prepararEmbutido();
		queso = cocina.prepararQueso();
		pan.setCategoria(catP);
		embutido.setCategoria(catE);
		queso.setCategoria(catQ);
		comida.setPan(pan);
		comida.setEmbutido(embutido);
		comida.setQueso(queso);	
		return comida;
	}	
}
