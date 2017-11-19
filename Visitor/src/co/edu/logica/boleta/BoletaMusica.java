package co.edu.logica.boleta;

import co.edu.logica.visitor.Visitor;

public class BoletaMusica extends Boleta implements Visitable {
	
	public BoletaMusica(){
		setPrecioBoleta(20000);
	}
	
	public void aceptarVisitor(Visitor visitante) {
		visitante.visitarBoletaMusica(this);	
	}

}
