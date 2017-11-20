package co.edu.logica;

public class Contexto {	

	private Estrategia estrategia=null;
	private int valorBoletas;
	
	/**M�todo que le a�ade una estrategia al metodo de pago*/
	public void setEstrategia(Estrategia estr){
		estrategia=estr;		
	}
	/**Metodo que realiza el pago seg�n la estrategia*/
	public void realizarPago(){
		estrategia.pagar(valorBoletas);
	}
	
	public int getValorBoletas() {
		return valorBoletas;
	}

	public void setValorBoletas(int valorBoletas) {
		this.valorBoletas = valorBoletas;
	}

}
