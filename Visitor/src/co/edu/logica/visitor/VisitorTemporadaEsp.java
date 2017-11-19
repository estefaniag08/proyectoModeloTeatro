package co.edu.logica.visitor;

import co.edu.logica.boleta.*;


public class VisitorTemporadaEsp implements Visitor {
	public void visitarBoletaCine(BoletaCine boleta){
		double precioFinal=boleta.getPrecioBoleta()-2000;
		boleta.setPrecioBoleta(precioFinal);
	}

	//Metodos vacios porque la promocion de temporada solo aplica para cine
	public void visitarBoletaTeatro(BoletaTeatro boleta) {			
	}
	public void visitarBoletaMusica(BoletaMusica boleta) {		
	}
	
}
