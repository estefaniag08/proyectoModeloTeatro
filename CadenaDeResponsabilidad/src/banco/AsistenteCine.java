/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import gestorFlujoConsola.Salida;

/**
 *
 * @author zachl
 */
public class AsistenteCine implements EmpleadoCine{

    public EmpleadoCine next;

    public void queja(String reclamo) {
		Salida salida = new Salida();
		switch (reclamo) {
		    case "suciedad":
			    salida.mostrar("Yo, el asistente del cine me puedo encargar");
			break;
		    case "objetos":
			    salida.mostrar("Yo, el asistente del cine me puedo encargar");
				break;
		    case "perdida":
			    salida.mostrar("Yo, el asistente del cine me puedo encargar");
				break;
		    case "niño":
			    salida.mostrar("Yo, el asistente del cine me puedo encargar");
				break;
		    default:
				salida.mostrar("No puedo manejar ese tipo de reclamos, deje llamo al gerente del cine");
				next.queja(reclamo);
		}
		

	}

    public void setNext(EmpleadoCine nivel) {
        next = nivel;
    }
}
