package co.edu.logica.visitor;

import co.edu.logica.boleta.*;


public class VisitorEdad implements Visitor{


	public void visitarBoletaCine(BoletaCine boleta) {
		double precioFinal=boleta.getPrecioBoleta()-1000;
		boleta.setPrecioBoleta(precioFinal);
	}

	public void visitarBoletaTeatro(BoletaTeatro boleta) {
		double precioFinal=boleta.getPrecioBoleta()-1500;
		boleta.setPrecioBoleta(precioFinal);
	}

	//Metodo vacio ya que esta promocion no aplica en los eventos de musica
	public void visitarBoletaMusica(BoletaMusica boleta) {

	}

}
