/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import gestorFlujoConsola.*;

/**
 *
 * @author zachl
 */
public class GerenteCine implements EmpleadoCine {

	public EmpleadoCine next;

	public void queja(String reclamo) {
		Salida salida = new Salida();
		switch (reclamo) {
		    case "comida":
			    salida.mostrar("Yo, el gerente del cine, me encargo de todo");
			break;
		    case "boleta":
				salida.mostrar("Yo, el gerente del cine, me encargo de todo");
				break;
		    case "empleado":
				salida.mostrar("Yo, el gerente del cine, me encargo de todo");
				break;
		    case "personas":
				salida.mostrar("Yo, el gerente del cine, me encargo de todo");
				break;
		    default:
				salida.mostrar("No puedo manejar ese tipo de reclamos, deje lo acompaño con el jefe del cine");
				next.queja(reclamo);
		}

	}

	public void setNext(EmpleadoCine nivel) {
		next = nivel;
	}
}
