package co.edu.logica;

public class Diccionario {
	private String idComida;
	private String idPromo;
	
	/**Método que separa el codigo del producto de la promocion*/
	public void RecibirCodigo(String codigo){
		String [] codigoSeparado= codigo.split("-");
		idComida=codigoSeparado[0];
		idPromo=codigoSeparado[1];
		
	}
	/**Método que conoce el significado de los codigos de promocion y retorna el valor de la promo*/
	public double DiccPromocion(){
		double porcentPromocion=0; 
		switch(idPromo){
			case "XX":{
				porcentPromocion=0;
			} break;
			case "P1":{
				porcentPromocion=0.10;
			} break;
			case "P2":{
				porcentPromocion=0.05;
				
			} break;
			case "P3":{
				porcentPromocion=0.50;
				
			} break;
			case "P4":{
				porcentPromocion=0.75;
				
			} break;
			case "P5":{
				porcentPromocion=0.80;
				
			} break;
			default: break;
		}
		return porcentPromocion;
	}
	
	/**Método que conoce el significado de los codigos del alimento y devuelve el valor*/
	public double DiccComida(){
		double valorProducto=0; 
		switch(idComida){
			case "H1":{
				valorProducto=5000;
			} break;
			case "H2":{
				valorProducto=2500;
				
			} break;
			case "C1":{
				valorProducto=7500;
				
			} break;
			case "C2":{
				valorProducto=9000;
				
			} break;
			case "D1":{
				valorProducto=15000;
				
			} break;
			case "D2":{
				valorProducto=10000;
				
			} break;
			default: break;
		}
		
		return valorProducto;
	}
	
}
