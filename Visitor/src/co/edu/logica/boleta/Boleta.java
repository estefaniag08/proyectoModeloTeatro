package co.edu.logica.boleta;

import co.edu.logica.visitor.Visitor;

public abstract class Boleta implements Visitable{
	protected double precioBoleta;
	/**Permite que el visitor realice la visita al objeto*/
	public abstract void aceptarVisitor(Visitor visitante);
	public double mostrarPrecio(){
		return precioBoleta;
	}
	
	public void setPrecioBoleta(double precioBoleta) {
		this.precioBoleta = precioBoleta;
	}

	public double getPrecioBoleta() {
		return precioBoleta;
	}

	
}
