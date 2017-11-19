package co.edu.logica.boleta;

import co.edu.logica.visitor.Visitor;

public class BoletaTeatro extends Boleta implements Visitable{
	public BoletaTeatro(){
		setPrecioBoleta(15000);
	}
	public void aceptarVisitor(Visitor visitante) {
		visitante.visitarBoletaTeatro(this);
	}

}
