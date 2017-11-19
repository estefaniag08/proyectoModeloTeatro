package co.edu.logica.visitor;

import co.edu.logica.boleta.*;


public class VisitorClientesFrec implements Visitor {

	public void visitarBoletaCine(BoletaCine boleta) {	
		double precioFinal=boleta.getPrecioBoleta()-2500;
		boleta.setPrecioBoleta(precioFinal);
	}

	public void visitarBoletaTeatro(BoletaTeatro boleta) {	
		double precioFinal=boleta.getPrecioBoleta()-1500;
		boleta.setPrecioBoleta(precioFinal);
	}

	public void visitarBoletaMusica(BoletaMusica boleta) {
		double precioFinal=boleta.getPrecioBoleta()-2500;
		boleta.setPrecioBoleta(precioFinal);
	}
	
}
