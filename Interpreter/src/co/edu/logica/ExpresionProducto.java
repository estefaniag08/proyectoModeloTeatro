package co.edu.logica;

public class ExpresionProducto extends Expresion{

	private double valorProductoTraducido; //El valor traducido que se mostrar� al empleado
	public double interpret(Diccionario diccionario) {
		double producto = diccionario.DiccComida();
		return producto;
		
	}

}
