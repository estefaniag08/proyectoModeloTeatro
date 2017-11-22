/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import banco.*;
import gestorFlujoConsola.*;

/**
 *
 * @author zachl
 */
public class Cadena {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		Entrada entrada = new Entrada();
		Salida salida = new Salida();
		String reclamo;
		salida.mostrar("Bienvenido al centro de quejas y reclamos, porfavor escriba el tipo de reclamo que tiene");
		reclamo = entrada.leer();
		AsistenteCine asisCine = new AsistenteCine();
		GerenteCine gerCine = new GerenteCine();
		JefeCine jefCine = new JefeCine();
		asisCine.setNext(gerCine);
		gerCine.setNext(jefCine);
		asisCine.queja(reclamo);
	}

}
