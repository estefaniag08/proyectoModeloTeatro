package co.edu.logica.boleta;

import co.edu.logica.visitor.Visitor;

public class BoletaCine extends Boleta implements Visitable {
	
	public BoletaCine(){
		setPrecioBoleta(8000);
	}
	
	public void aceptarVisitor(Visitor visitante) {
		visitante.visitarBoletaCine(this);
	}
}

