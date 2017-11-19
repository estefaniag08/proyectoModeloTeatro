package gestionPrueba;



import categorias.*;
import cocinas.Director;
import gestorFlujoConsola.*;


public class Prueba {
	public static void main (String arg []){
		//Declaracion de atributos 
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		Director director = new Director();   
		CategoriaPan catP= null;
		CategoriaEmbutido catE = null;
		CategoriaQueso catQ= null;
		
		
		//menu opciones de comida
		salida.mostrar("Seleccione la comida que desea");
		salida.mostrar("1. Perro Caliente");
		salida.mostrar("2. Hamburguesa");
		salida.mostrar("3. Sandwich");
		int opcionComida= entrada.leerEntero();
		
		//menu opciones de pan
		salida.mostrar("Seleccione la categoria de pan que desea");
		salida.mostrar("1. Blanco");
		salida.mostrar("2. Integral");
		salida.mostrar("3. Centeno");
		int opcionPan = entrada.leerEntero();
		
		//menu opciones de embutido
		salida.mostrar("Seleccione la categoria de embutido que desee");
		salida.mostrar("1. Cerdo");
		salida.mostrar("2. Pollo");
		salida.mostrar("3. Res");
		int opcionEmb = entrada.leerEntero();
		
		//menu opciones de queso
		salida.mostrar("Seleccione la categoria de queso que desee");
		salida.mostrar("1. Cheedar");
		salida.mostrar("2. Mozarella");
		salida.mostrar("3. Holandes");
		int opcionQueso = entrada.leerEntero();	
		//asignar categoria de pan
		switch (opcionPan) {
		case 1:
			catP = new Blanco();
			break;
		case 2:
			catP = new Integral();
			break;
		case 3:
			catP = new Centeno();
			break;
		}		
		//asignar categoria de embutido
		switch (opcionEmb) {
		case 1:
			catE = new Cerdo();
			break;
		case 2:
			catE = new Pollo();
			break;
		case 3:
			catE = new Res();
			break;
		}	
		//asignar categoria de queso
		switch (opcionQueso) {
		case 1:
			catQ = new Cheedar();
			break;
		case 2:
			catQ = new Mozarella();
			break;
		case 3:
			catQ = new Holandes();
			break;
		}	
	director.preparar(opcionComida, catP, catQ, catE);//preparar comida mediante el director
	salida.mostrar(director.especificarComida()); //mostrar especificaciones mediante el director	
	}
	
}
