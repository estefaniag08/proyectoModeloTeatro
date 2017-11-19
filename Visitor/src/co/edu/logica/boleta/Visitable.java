package co.edu.logica.boleta;

import co.edu.logica.visitor.Visitor;

public interface Visitable {
	/**Metodo que permita a un objeto ser visitable*/
	public void aceptarVisitor(Visitor visitante);
}
