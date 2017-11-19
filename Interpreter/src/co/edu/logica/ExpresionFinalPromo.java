package co.edu.logica;

public class ExpresionFinalPromo extends Expresion {

	private Expresion palabraProducto=null;
	
	public double interpret(Diccionario diccionario) {
		palabraProducto = new ExpresionProducto();								//Instancia de objeto de tipo Expresion producto
		double prod = palabraProducto.interpret(diccionario);			//Se da significado e interpreta el codigo del producto
		
		double promo = diccionario.DiccPromocion();						//Se da significado al codigo de promocion
		double precioFinal = prod - prod*promo;							//Se interpreta la expresion completa
		
		return precioFinal;												//Retorna la traduccion completa del codigo
	}

}
