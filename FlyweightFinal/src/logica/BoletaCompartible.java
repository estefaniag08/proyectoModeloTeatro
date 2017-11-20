package logica;

public class BoletaCompartible extends Boleta {
	
	//crea una boleta pasando los atributos extrinsecos como variables
	public BoletaCompartible(String nombre, String evento) {
		super(nombre, evento);
	}
	@Override
	//metodo imprimir boleta
	public String imprimir() {
		return separador  + "\n" +
				"Nombre: "+ nombreAfiliado + "\n" +
				"Evento: "+ evento + "\n"+
				separador;				
	}
	
}
