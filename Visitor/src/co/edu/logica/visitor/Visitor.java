package co.edu.logica.visitor;

import co.edu.logica.boleta.BoletaCine;
import co.edu.logica.boleta.BoletaMusica;
import co.edu.logica.boleta.BoletaTeatro;

public interface Visitor {
	/**Metodo que permite visitar la boletaCine*/
	public void visitarBoletaCine(BoletaCine boleta);
	/**Metodo que permite visitar la boletaTeatro*/
	public void visitarBoletaTeatro(BoletaTeatro boleta);
	/**Metodo que permite visitar la boletaMusica*/
	public void visitarBoletaMusica(BoletaMusica boleta);
	
}
