package logica;

import java.util.ArrayList;

public class FabricaPesoLigero {
	
	//array de boletas creadas
	ArrayList <Boleta> boletas = new ArrayList <Boleta>();
	
	public Boleta getBoleta(String nombre, String evento){
		Boleta boleta=null;
		//busca si ya existe una boleta con esas especificaciones
		for(int i=0; i<boletas.size();i++){
			//si existe iguala la boleta a la ya existente
			if (boletas.get(i).getEvento().equals(evento)
					&& boletas.get(i).getNombreAfiliado().equals(nombre)){
				boleta = boletas.get(i);
				i=boletas.size();
				
			}		
		}
		//sino crea una nueva boleta con esas especificaciones
		if(boleta==null){	
			boleta = new BoletaCompartible(nombre,evento);
			//la añade al array para futuras busquedas
			boletas.add(boleta);
		}
		return boleta;
	}
}
